package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class LoginTestData {
	
	
	
	@DataProvider
	public Object[][] loginTestData()
	{
		return new Object[][] { 
			{"admin@gmail.com","Welcome@123"},
			{"supplier@gmail.com", "Welcome@12"},
			{"Supplier@gmail.com", "Test@123"},
			{"jhfgjhgjfgh", ""}
			};
	}
	@Test (dataProvider = "loginTestData")
	public void loginTest(String UN, String PWD)
	{
	  Assert.assertTrue(doLogin(UN,PWD));
	}
	// lests say if we want to login with 10 different users, then what we have to do..?
	// for that we have to parameterize the users with the help of data providers
	public boolean doLogin(String UN, String PWD)
	{
		System.out.println("Username :" +UN);
		System.out.println("Password :"+PWD);
		System.out.println("Login Successful");
		return true;
	}

}
