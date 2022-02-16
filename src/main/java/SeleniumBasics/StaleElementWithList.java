package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementWithList {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> footerLinks=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		//for (WebElement e : footerLinks) 
		for(int i=0;i<footerLinks.size();i++)
		{
			footerLinks.get(i).click();
			Thread.sleep(1000);
			driver.navigate().back();
			footerLinks=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		}

	}

}
