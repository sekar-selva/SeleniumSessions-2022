package SeleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		By FirstName = By.id("firstName123");
		By LastName = By.id("lastName");

		
		/*
		 * Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
		 * .withTimeout(Duration.ofSeconds(10)) .pollingEvery(Duration.ofSeconds(2))
		 * .ignoring(NoSuchElementException.class)
		 * .ignoring(StaleElementReferenceException.class); WebElement firstname_ele =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(FN));
		 * firstname_ele.sendKeys("shekar");
		 */
		//waitforElementWithFluentWait(FirstName, 10, 2).sendKeys("shekar");
		waitforElementWithWebDriverWait(FirstName, 10, 2).sendKeys("Shekar");
		driver.findElement(LastName).sendKeys("selva");
	}
	
	/*
	 * public static WebElement waitforElementWithFluentWait(By locator, int
	 * timeout, int pollingtime) { Wait<WebDriver> wait =new
	 * FluentWait<WebDriver>(driver) .withTimeout(Duration.ofSeconds(timeout))
	 * .pollingEvery(Duration.ofSeconds(pollingtime))
	 * .ignoring(NoSuchElementException.class)
	 * .ignoring(StaleElementReferenceException.class) .withMessage(locator +
	 * " is not found in the given time"); return
	 * wait.until(ExpectedConditions.presenceOfElementLocated(locator)); }
	 */
	public static  WebElement waitforElementWithWebDriverWait(By locator, int timeout, int pollingtime) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		wait.pollingEvery(Duration.ofSeconds(pollingtime))
		.ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class)
		.withMessage(locator + " is not found in the given time");
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));	
	}

}
