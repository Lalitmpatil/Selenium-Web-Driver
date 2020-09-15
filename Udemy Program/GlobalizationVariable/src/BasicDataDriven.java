import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class BasicDataDriven {
	public WebDriver driver = null;
	@Test
	public void Login() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\lalit\\Desktop\\Selenium Udemy\\Udemy Program\\GlobalizationVariable\\src\\DataDriven.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").contains("firefox"))
		{
			//System.setProperty("webdriver.firefox.driver", "C:\\work\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			//setProperty("webdriver.InternetExplorer.driver", "C:\\work\\chromedriver.exe");
			driver = new InternetExplorerDriver();
		}
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
