package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForWebElements {
 static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		By footerlinks = By.cssSelector("ul.footer-nav > li > a");
		
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> footersection = waitForElementsvisibleBy(footerlinks, 10);
		for (WebElement e : footersection) {
			String text =e.getText();
			System.out.println(text);
			
		}
	}
		public static List<WebElement> waitForElementsvisibleBy(By locator, int timeout)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
	}


