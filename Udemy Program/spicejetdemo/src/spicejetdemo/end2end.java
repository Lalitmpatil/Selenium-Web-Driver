package spicejetdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class end2end {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();		
		Assert.assertTrue(driver.findElement(By.cssSelector(".custom_date_pic.required.home-date-pick")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector(".custom_date_pic.required.home-date-pick")).isEnabled());
		/*Assert.assertFalse(driver.findElement(By.cssSelector(".custom_date_pic.required.home-date-pick")).isEnabled());
		System.out.println(driver.findElement(By.cssSelector(".custom_date_pic.required.home-date-pick")).isEnabled());*/
		driver.findElement(By.id("divpaxinfo")).click();
		
		//Static dropdown handling
		Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByIndex(6);
		
		Select s1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s1.selectByValue("USD");
		
		//Handling of java alert
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//if you want click on cancel button of java alert then use dismiss() method of alert.
		//driver.switchTo().alert().dismiss();
		
	}

}
