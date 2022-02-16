package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement2 {
 static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://mrbool.com/search/");
		WebElement element = driver.findElement(By.xpath("//a[@class='menulink']"));
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("SINGLE VIDEOS")).click();
		
		 

	}

}
