package TestNGFeatures;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {

	@Test (expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void loginTest()
	{
		System.out.println("Login Test");
		int i=9/0;
	}
	@Test
	public void searchTest()
	{
		System.out.println("Search Test");
	}
}
