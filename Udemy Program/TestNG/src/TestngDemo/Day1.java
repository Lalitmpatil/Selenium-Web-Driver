package TestngDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeSuite
	public void BeforeSuitDemo()
	{
		System.out.println("Before Suit Method I am the First");
	}
	
	@BeforeTest
	public void  BTest()
	{
		System.out.println("I Will Execute First (@BeforeTest Annoatation");
	}
	
	@BeforeMethod
	public void BeforeMethodDemo()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AfterMethodDemo()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void BeforeClassDemo()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AfterClassDemo()
	{
		System.out.println("After Class");
	}
	
	@Test  
	public void Demo()
	{
		System.out.println("Demo method");
	}	
	
	@Test(groups= {"Smoke"})
	public void print()
	{
		System.out.println("Print Method");
	}
}
