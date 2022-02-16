package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinkClickUtility {

	static WebDriver driver;
	
	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com");
		By FooterLink = By.xpath("//*[@class='footer-nav']//a");
		ClickOnLinks(FooterLink, "Board of Directors");
		
	}
		
	public static void ClickOnLinks(By locator, String linktext)
	{
		List<WebElement> linkslist=driver.findElements(locator);
			for (WebElement e : linkslist) {
			String text =e.getText();
			System.out.println(text);
			if (text.contains(linktext)) {
				e.click();
				break;
			}
			
		}
		
		}
		
		
	}


