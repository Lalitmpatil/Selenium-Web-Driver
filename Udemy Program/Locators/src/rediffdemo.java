import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class rediffdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		//driver.get("http://rediff.com");
		//driver.findElement(By.cssSelector("a[class='signin']")).click();
		//driver.findElement(By.cssSelector("input[id='username']")).sendKeys("3234"); //syntax for xpath --> tagname[attribut='value']
		//driver.findElement(By.cssSelector("input#username")).sendKeys("1231234");  //syntax for xpath --> tagname#id
		driver.findElement(By.cssSelector("[class='inputgroup']")).sendKeys("Lalit Patil");
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("436578");  //tagName[@attribute='value']  - xpath syntax
		driver.findElement(By.cssSelector("input[class*='password']")).sendKeys("567");  //syntax for CSS --> tagName[Atrribute*='value'] 
		//driver.findElement(By.xpath("//input[contains(@id,'Login']")).click();
		
	}
}
