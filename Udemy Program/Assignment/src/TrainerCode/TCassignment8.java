package TrainerCode;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCassignment8 
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://qaclickacademy.com/practice.php");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Uni");
				Thread.sleep(2000);
				By dropdownId = By.id("ui-id-1");
				if (driver.findElements(dropdownId).size() > 0)
				{
					List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
					int totalSize = list.size();
					System.out.println("size - " + totalSize);
					int i = 0;
					while (totalSize > i)
					{
						System.out.println("li element value - " + list.get(i).getText());
						if (list.get(i).getText().equalsIgnoreCase("United Kingdom (UK)"))
						{
							list.get(i).click();
							break;
						}
						i++;
					}
				}
			}
	}

