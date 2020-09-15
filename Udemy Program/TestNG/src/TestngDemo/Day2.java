package TestngDemo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day2 {
	@Test(groups= {"Smoke"})
	public void DemoABC()
	{
		System.out.println("DemoABC method");
	}	
	
	@AfterTest
	public void ATest()
	{
		System.out.println("I Will Execute At Last @AfterTest");
	}
	
	@AfterSuite
	public void AfterSuitDemo()
	{
		System.out.println("After Suite, I am the 1st from Last");
	}
}
