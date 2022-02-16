package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionSendkeys {
		static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By mail = By.id("input-email");
		By pwd = By.id("input-password");
		By submit = By.xpath("//input[@type='submit']");
		doSendKeys(mail, "sekar@gmail.com");
		doSendKeys(pwd, "sekar");
		doclick(submit);
		
	}
		
		public static WebElement getElement(By locator)
		{
		 return driver.findElement(locator);
		}
		public static void doSendKeys(By locator, String value)
		{
			Actions act = new Actions(driver);
			act.sendKeys(getElement(locator),value).perform();
		}
		public static void doclick(By locator)
		{
			Actions act = new Actions(driver);
			act.click(getElement(locator)).perform();
			
		}

}
