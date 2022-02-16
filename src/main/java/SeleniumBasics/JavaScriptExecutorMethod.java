package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorMethod {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://65.1.183.131/Procure360/#/login");
		
		By next = By.xpath("//button[@class='login100-form-btn']");
		//WebElement username = driver.findElement(By.xpath("//input[@name='loginInfoVO.username']"));
		
		
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver; String title =
		 * js.executeScript("return document.title;").toString();
		 * 
		 * System.out.println(title);
		 */
		
		// for getting  

		JavaScriptUtility jsutil = new JavaScriptUtility(driver);
		driver.navigate().refresh();
		String title= jsutil.getTitleByJS();
		
		System.out.println(title);
		String innerText=jsutil.getPageInnerText(); // this is the direct method geet all the text from the website but in selenium it is not available
		//jsutil.generateAlert("Please Pass the user name");
		//WebElement signin = driver.findElement(By.xpath("//div[@class='wrap-login100']"));
		
		//jsutil.drawBorder(signin);
		//jsutil.drawBorder(username);
		WebElement name = driver.findElement(By.xpath("//input[@name='loginInfoVO.username']"));
		
		jsutil.flash(name);
		name.sendKeys("Ramcogroup");
		WebElement  Next =driver.findElement(By.xpath("//button[@class='login100-form-btn']"));
		jsutil.clickElementByJS(Next);
		WebElement password = driver.findElement(By.xpath("//input[@name='loginInfoVO.password']"));
		jsutil.flash(password);
		password.sendKeys("Welcpme@123");
		jsutil.scrollPageDown();
		Thread.sleep(5000);
		jsutil.scrollPageUp();
		jsutil.sendKeysUsingWithId(title, innerText)
	
	
	}
 
}
