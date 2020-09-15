import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenkart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		String[] vegetable = { "Carrot", "Brinjal", "Potato", "Capsicum" };
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		Add2Kart(driver, vegetable);
		proceed2kart(driver);
	}

	public static void Add2Kart(WebDriver driver, String[] vegetable) {
		int count = 0;
		List<WebElement> productlist = driver.findElements(By.xpath("//h4[@class='product-name']"));
		// Print Array check below commented code

		/*
		 * for(int i=0; i<productlist.size(); i++) {
		 * System.out.println(productlist.get(i).getText().toString()); }
		 * 
		 * for(int j=0; j<vegetable.length; j++) {
		 * System.out.println(vegetable[j].toString()); }
		 */

		for (int i = 0; i < productlist.size(); i++) 
		{
			for (int j = 0; j < vegetable.length; j++)
				if (productlist.get(i).getText().contains(vegetable[j].toString())) 
				{
					count++;
					driver.findElements(By.cssSelector("div.product-action")).get(i).click();
					if (count == vegetable.length)
						break;
				}
		}
	}
	
	public static void proceed2kart(WebDriver driver)
	{
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}

}
