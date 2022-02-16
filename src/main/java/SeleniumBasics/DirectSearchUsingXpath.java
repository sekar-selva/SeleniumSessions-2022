package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectSearchUsingXpath {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.findElement(By.xpath("//*[@class='desktop-searchBar']")).sendKeys("shorts");
		Thread.sleep(3000);
		selectSuggestion("Shorts Men");
		
		

	}
public static void selectSuggestion(String suggestion)
{
	WebElement element =driver.findElement(By.xpath("//*[@class='desktop-group']/li[contains(text(),'"+suggestion+"')]"));
	element.click();
}
}
