package TestngDemo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Parameters({"URL","APIKEY/username"})
	@Test
	public void hello(String urlname, String key)
	{
		System.out.println("Hello Method");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test
	public void HI()
	{
		System.out.println("HI Method");
	}
	
	@Test(enabled=false)
	public void Bye()
	{
		System.out.println("Bye Method");
	}
	
	@Test
	public void Weblogin()
	{
		System.out.println("Weblogin method");
	}
	
	
	@Test(dependsOnMethods= {"Weblogin","Mobilelogin"})
	public void APIlogin()
	{
		System.out.println("APIlogin method");
	}
	
	@Test
	public void Mobilelogin()
	{
		System.out.println("Mobilelogin method");
	}
	
}
