package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementExceptionProgram {
	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
			WebElement fn =driver.findElement(By.id("firstName"));
			fn.sendKeys("Sekar");
			driver.navigate().refresh();
			/*
			 * WebElement fn1 =driver.findElement(By.id("firstName")); fn.sendKeys("Selva");
			 */

			By firstname = By.id("firstName");
			
			FluentWait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(StaleElementReferenceException.class);
			WebElement locator=wait.until(ExpectedConditions.presenceOfElementLocated(firstname));
			locator.sendKeys("Selva");
			
					
	}

}
