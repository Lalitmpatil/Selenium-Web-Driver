import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateelementclassname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		driver.findElement(By.id("username")).sendKeys("Lalitmp74@yahoo.co.in");
		
		driver.findElement(By.id("password")).sendKeys("232323");
		
		//driver.findElement(By.className("button r4 wide primary")).click(); // error shown like no such element found or Invalid selector :Compound class name  not permitted.
	
		// Class Name Locator Note - scan from top to left
		
		//driver.findElement(By.xpath("//*[@id=\'Login\']")).click();  //Xpath locator from browser
		
		driver.findElement(By.cssSelector("#Login")).click(); //css selector from browser
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\'error\']")).getText());
		
	}

}
