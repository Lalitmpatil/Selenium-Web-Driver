package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {
	
	WebDriver driver;
	
	public Rediffloginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.xpath("//input[@name='login']");
	By pass = By.cssSelector("input[id='password']");
	By go = By.xpath("//input[@name='proceed']");
	By home = By.partialLinkText("rediff");
	
	public WebElement emailid()
	{
		return driver.findElement(username);
	}

	public WebElement password()
	{
		return driver.findElement(pass);
	}

	public WebElement go()
	{
		return driver.findElement(go);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}
}
