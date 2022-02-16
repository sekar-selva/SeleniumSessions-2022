package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforAlert {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		//driver.switchTo().alert();
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]")).click();
		
	
		
	}
		public static Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public static String  getAlertText(int timeout) {
			 return waitForAlert(timeout).getText();
		}
		public static void  acceptAlert(int timeout)
		{
			waitForAlert(timeout).accept();
		}
		public static void dismissAlert(int timeout)
		{
			waitForAlert(timeout).dismiss();
		}
	{
		
	}

}
