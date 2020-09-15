import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.className("table-display"));
		int rowcount = table.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr")).size();
		System.out.println("Total Rows are ="+ rowcount);
		int colcount = table.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/th")).size();
		System.out.println("Total Columns are ="+ colcount);
		
		for(int i=0; i<rowcount; i++)
		{
			if(i==2)
			{
				System.out.println(table.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr")).get(i).getText());
			}
		}
	}
}
