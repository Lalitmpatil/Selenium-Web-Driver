package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.Rediffhomepage;
import ObjectRepository.Rediffloginpage;
import ObjectRepository.RediffloginpagePF;

public class Loginapplication {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//Rediffloginpage rd = new Rediffloginpage(driver);
		RediffloginpagePF rd = new RediffloginpagePF(driver);
		rd.emailid().sendKeys("Hello");
		rd.password().sendKeys("demo");
		rd.go().click();
		rd.Home().click();		
		
		Rediffhomepage rh = new Rediffhomepage(driver);
		rh.Search().sendKeys("Hello");
		rh.Submit().click();
	}
}
