package Apptestcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OpenCart extends BaseTest {


	@Test(priority = 1)
	public void getTitleTest()
	{
		
		Assert.assertEquals(driver.getTitle(),"Account Login");
		
	}
	@Test(priority =  2)
	public void opencartSearch()
	 {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("div#logo a")).isDisplayed());
	 }
	

}
