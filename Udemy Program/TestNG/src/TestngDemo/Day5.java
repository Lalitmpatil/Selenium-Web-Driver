package TestngDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day5 {
	@Test
	public void login()
	{
		System.out.println("login Method");
	}
	
	@Test(groups= {"Smoke"})
	public void SignIn()
	{
		System.out.println("Signin");
	}
	
	@Test
	public void SignOut()
	{
		System.out.println("SignOut Method");
		Assert.assertTrue(false);
	}
	

}
