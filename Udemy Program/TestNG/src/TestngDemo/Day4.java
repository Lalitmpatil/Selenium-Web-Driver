package TestngDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test(dataProvider="getData")	
	public void A(String username, String password)
	{
		System.out.println("A Method");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Parameters({"URL"})
	@Test
	public void B(String urlname)
	{
		System.out.println("B Method");
		System.out.println(urlname);
	}
	
	@Test
	public void C()
	{
		System.out.println("C Method");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// 1st combination - User name and password with good credit
		// 2nd combination - User name and password not credit history
		// 3rd combination - fraud history
		
		Object[][] obj = new Object[3][2];
		obj[0][0]="Firstsetusername";
		obj[0][1]="Password";
		
		//columns is the row is nothing but the values for particular combination
		
		obj[1][0]="Secondsetusername";
		obj[1][1]="Password";
		
		obj[2][0]="Thirdsetusername";
		obj[2][1]="Password";
		
		return obj;
	}
	
	
}
