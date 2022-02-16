package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforURL {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.linkText("Register")).click();
		String url =waitForUrlContains("account/register", 5); 
		System.out.println(url);
		
	}
	
	public static String  waitForUrlContains(String urlfraction, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlContains(urlfraction)))
				{
					return driver.getCurrentUrl();
				}
		 	return null;
	}

	public static String  waitForUrlToBe(String url, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlContains(url)))
				{
					return driver.getCurrentUrl();
				}
		 	return null;
	}
}
