package MiscellaneousPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		//driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();--comment because to get list descending
		List<WebElement> firstcol = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		ArrayList <String> originallist = new ArrayList<String>();
		for(int i=0 ;i<firstcol.size();i++)
		{
			System.out.println(firstcol.get(i).getText());
			originallist.add(firstcol.get(i).getText());
		}
		
		ArrayList <String> copiedlist = new ArrayList<String>();
		
		for(int i=0 ;i<firstcol.size();i++)
		{
			//System.out.println(firstcol.get(i).getText());
			copiedlist.add(originallist.get(i));
		}
		System.out.println("**********");
		//sort array
		//Collections.sort(copiedlist); --- sort() for ascending order & reverse() for descending order
		Collections.reverse(copiedlist);
		for(String s:copiedlist)
		{
			System.out.println(s);
		}
		System.out.println("**********");
		for(String s:originallist)
		{
			System.out.println(s);
		}
		
		
		//equals used to check two arrays are same
		//Assert.assertTrue(originallist.equals(copiedlist));
	}
}
