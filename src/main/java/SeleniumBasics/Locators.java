package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		// Locators concept 
		// 1. driver.findelement
		// this is worst method why because when ever you want to re use you have to write the same line again and again
		
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("sekar");
		 * driver.findElement(By.id("input-password")).sendKeys("sekar");
		 */
		//2 . Create the web element and store it and call
		
		/*
		 * WebElement userid= driver.findElement(By.id("input-email")); WebElement
		 * password = driver.findElement(By.id("input-password"));
		 * 
		 * userid.sendKeys("sekar"); password.sendKeys("1234567889");
		 */
		
	//5th method is fine
		By username = By.id("input-email");
		By pwd = By.id("input-password");
		
		/*
		 * credentials(username).sendKeys("sekar"); credentials(pwd).sendKeys("selva");
		 */	
	
	// 6th method , follows the credentials method along with the dosendkeys method
	/*
	 * doSendkeys(username, "sekar_selva"); doSendkeys(pwd,
	 * "58659849865649689456865968496849586");
	 */
		ElementUtil utility = new ElementUtil(driver);
				utility.doSendkeys(username, "ashok selvan");
				utility.doSendkeys(pwd, "85649586956849");
	}
	public  static WebElement credentials(By locator)
	{
		return driver.findElement(locator);
	}
	public  static void doSendkeys(By locator, String value) {
		credentials(locator).sendKeys(value);
	}
	
	//
	

}
