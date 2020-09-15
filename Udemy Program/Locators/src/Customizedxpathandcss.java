import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customizedxpathandcss {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.0.140/OMG_ERP/Login.aspx"); 
		driver.findElement(By.xpath("//input[@id=\'txtUserName\']")).sendKeys("admin"); //Customized Xpath
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@123"); //Customized Xpath
		driver.findElement(By.cssSelector("input[value='Login']")).click(); //Customized CSS selector
		driver.findElement(By.xpath("//*[@id='lblUserName']")).click();  //Customized Xpath
		driver.findElement(By.cssSelector("#lnkSignOut")).click(); //Customized CSS Selector 
	}
}
