package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {
	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement credentials(By locator) {
		return driver.findElement(locator);
	}

	public void doSendkeys(By locator, String value) {
		credentials(locator).sendKeys(value);
	}
	public  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	
	}
	
	/**
	 *  wait for  the url contains particular string after redirecting
	 * @param urlfraction
	 * @param timeout
	 * @return
	 */
	public  String  waitForUrlContains(String urlfraction, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlContains(urlfraction)))
				{
					return driver.getCurrentUrl();
				}
		 	return null;
	}
/** 
 * wait for URL to be
 * @param url
 * @param timeout
 * @return
 */
	public  String  waitForUrlToBe(String url, int timeout){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		if(wait.until(ExpectedConditions.urlContains(url)))
				{
					return driver.getCurrentUrl();
				}
		 	return null;
	}
	
	
	public  Alert waitForAlert(int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
		}
		
		public  String  getAlertText(int timeout) {
			 return waitForAlert(timeout).getText();
		}
		public  void  acceptAlert(int timeout)
		{
			waitForAlert(timeout).accept();
		}
		public  void dismissAlert(int timeout)
		{
			waitForAlert(timeout).dismiss();
		}
		
		
		/**
		 *  Polling time mechanism
		 * @param locator 
		 * @param timeout
		 * @return
		 */
		
		
		public  WebElement waitforElementvisiblie (By locator, int timeout, int pollingtimeout)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(pollingtimeout), Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}
		
		
		
		
		public  List<WebElement> waitForElementsvisibleBy(By locator, int timeout)
		{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
			return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		}
}
