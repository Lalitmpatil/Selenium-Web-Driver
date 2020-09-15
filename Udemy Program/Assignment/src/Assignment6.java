import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		//1. Select Option2 checkbox
		driver.findElement(By.xpath("//input[@value = 'option2']")).click();
		
		//2. Get text of selected check box
		String chkopt = driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
		System.out.println(chkopt);		
		driver.findElement(By.id("dropdown-class-example")).click();
		
		//3. Send the Selected check box text to drop down
		List<WebElement> options = driver.findElements(By.tagName("option"));
		for(int i=1; i<options.size();i++)
		{
			
			if(options.get(i).getText().contains(chkopt))
			{
				System.out.println(options.get(i).getText());
				options.get(i).click();
			}
		}
		
		//4. Send the Selected check box text to Switch To Alert Example
		driver.findElement(By.id("name")).sendKeys(chkopt);
		driver.findElement(By.id("alertbtn")).click();
		
		//5. match the Selected check box text on alert 
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
				
	}
}
