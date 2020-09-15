import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("Lalitmp74@yahoo.co.in"); // id locator
		
		driver.findElement(By.name("pass")).sendKeys("123456"); //name locator
		
		//driver.findElement(By.linkText("Forgotten account?")).click(); // Link text locator
		
		
		
		
		
		
		

	}

}
