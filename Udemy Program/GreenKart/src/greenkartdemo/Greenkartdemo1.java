package greenkartdemo;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkartdemo1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String[] Name = { "Cucumber", "Brocolli" };
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(2000);
		// Simple Array
		// List ItemNeeded = Arrays.asList(Name);
		// Convert array into array list for easy search

		List<WebElement> product = driver.findElements(By.cssSelector("h4.product-name"));
		int count = 0;
		for (int i = 0; i < product.size(); i++) {
			for (int j = 0; j < Name.length; j++) {
				// String[] name1=product.get(i).getText().split("-");
				// String formattedname = name1[0].trim();
				// List<String> ItemNeeded = Arrays.asList(Name);

				if (product.get(i).getText().contains(Name[j].toString()))
				{
					// click on Add to Cart
					//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					count++;
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					Thread.sleep(2000);
					if (count == Name.length) 
					{
						break;
					}
				}
			}
		}
	}
}
