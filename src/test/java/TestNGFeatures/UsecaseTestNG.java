package TestNGFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UsecaseTestNG {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://demo.opencart.com/index.php?route=account/login");
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}
	
	@Test
	public void logoText()
	{
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='btn btn-primary']")).isDisplayed());
}
	}

