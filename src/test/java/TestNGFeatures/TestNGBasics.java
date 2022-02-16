package TestNGFeatures;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {
	@BeforeSuite
	public void createUser()
	{
		System.out.println("BS ---Before suite");
	}
	@Test
	public void connectwithDB()
	{
		System.out.println("Test -- Connect with DB");
	}
	@BeforeClass
	public void launchBrowser()
	{
		System.out.println("BC ---- Launch Browser");
	}
	@BeforeMethod
	public void loginApp()
	{
		System.out.println("BM----Login app");
	}
	@Test	
	public void homePageTest()
	{
		System.out.println("Test ----Home page test");
	}
	@Test
	public void homepageText()
	{
		System.out.println("Test---Home page text");
	}
	@AfterMethod
	public void tearDown()
	{
		System.out.println("AM ---Close the browser");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("BT ----Hey there");
	}
}
