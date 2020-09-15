import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(2000);
		

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByIndex(4);

		Select s1 = new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(3);

		Select s2 = new Select(driver.findElement(By.id("Infants")));
		s2.selectByIndex(1);

		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active ")).click();

		driver.findElement(By.id("MoreOptionsLink")).click();
		driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("indigo");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
	}

}
