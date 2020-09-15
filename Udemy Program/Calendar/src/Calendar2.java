import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		//while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> element= driver.findElements(By.className("day"));
		int count= driver.findElements(By.className("day")).size();
		System.out.println(count);
		for(int i=0; i<count ; i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("24"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
