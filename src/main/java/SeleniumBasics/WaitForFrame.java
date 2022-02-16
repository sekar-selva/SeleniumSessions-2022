package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForFrame {
 static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		//driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		By framelocator =By.id("mce_0_ifr");
		waitForFrameLocator(framelocator, 5);
		String text = driver.findElement(By.id("tinymce")).getText();
		System.out.println(text);
		
	}

	
	public static WebDriver waitForFrameLocator(By framelocator, int timeout)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		 return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framelocator));
		
	}
	
}
