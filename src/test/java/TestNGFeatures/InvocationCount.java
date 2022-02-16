package TestNGFeatures;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test (invocationCount = 5)
	public void supplierTest()
	{
		System.out.println("Supplier Test");
	}
	@Test
	public void customerTest()
	{
		System.out.println("Customer Test");
	}
}
