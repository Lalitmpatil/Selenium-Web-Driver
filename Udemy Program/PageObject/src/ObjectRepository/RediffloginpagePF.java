package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffloginpagePF {
	
	WebDriver driver;
	
	public RediffloginpagePF(WebDriver driver)
	{
		System.out.println("Page Factory Object");
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	/*By username = By.xpath("//input[@name='login']");
	By pass = By.cssSelector("input[id='password']");
	By go = By.xpath("//input[@name='proceed']");
	By home = By.partialLinkText("rediff");
	*/
	
	@FindBy(xpath="//input[@name='login']")
	WebElement username;
	
	@FindBy(css="input[id='password']")
	WebElement pass;
	
	@FindBy(xpath="//input[@name='proceed']")
	WebElement go;
	
	@FindBy(partialLinkText="rediff")
	WebElement home;
	
	public WebElement emailid()
	{
		return username;
	}

	public WebElement password()
	{
		return pass;
	}

	public WebElement go()
	{
		return go;
	}
	
	public WebElement Home()
	{
		return home;
	}
}
