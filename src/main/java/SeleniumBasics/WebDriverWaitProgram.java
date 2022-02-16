package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		By FN = By.id("firstName");
		By LN = By.id("lastName");
		
		
		// Explicitly wait for defined element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement firstname=wait.until(ExpectedConditions.presenceOfElementLocated(FN));
		firstname.sendKeys("sekar");
		
		
		driver.findElement(LN).sendKeys("selva");
	}
 
}
