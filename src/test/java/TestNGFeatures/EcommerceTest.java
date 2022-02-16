package TestNGFeatures;

import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;



public class EcommerceTest {

	@Test(priority = 3)
	public void login()
	{
		System.out.println("Login");
	}
	@Test
	public void getText()
	{
		System.out.println("Get text");
	}
	@Test
	public void getTitle()
	{
		System.out.println("Get title");
	}
	@Test(priority = 1)
	public void logOut()
	{
		System.out.println("Logout method");
	}
}
