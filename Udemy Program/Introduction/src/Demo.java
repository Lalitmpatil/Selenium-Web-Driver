import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://google.com");  // Hit The Url on the browser
		
		System.out.println(driver.getTitle()); // Validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url
		
		//System.out.println(driver.getPageSource()); // print the page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back(); // to hit back button on browser (navigate back)
		
		driver.navigate().forward(); // to hit forward button on browser
		
		driver.close(); //it closes the current browser
		
		driver.quit(); // it closes all the browsers opened by selenium script
		
	}

}
