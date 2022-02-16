package TestNGFeatures;

import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@Test 
	public void loginTest()
	{
		System.out.println("Login Test");
		
		try {
			int i = 9/0;
		} catch (ArithmeticException e) {
			System.out.println("Getting the arithmentic exception");
			e.printStackTrace();
		}
	}
	@Test (dependsOnMethods = "loginTest")
	public void searchTest()
	{
		System.out.println("Search test");
	}
	@Test (dependsOnMethods = "loginTest")
	public void homeTest()
	{
		System.out.println("Home test");
	}

}
