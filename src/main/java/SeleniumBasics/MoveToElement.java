package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement mousehover = driver.findElement(By.xpath("//button[@id='mousehover']"));
		
		Actions act = new Actions(driver); // here have to pass the driver not the web element
		Thread.sleep(3000);
		act.moveToElement(mousehover).perform(); // here we can use build().perform() also and perform() also both are same and build() is internally calling perform() method only
		driver.findElement(By.linkText("Reload")).click();
		
			

	}

}
