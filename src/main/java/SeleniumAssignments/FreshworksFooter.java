package SeleniumAssignments;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FreshworksFooter {
	static WebDriver driver;
	
	public static void main (String [] args)
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https:www.freshworks.com");
		By footers = By.xpath("//*[@class='footer-nav copyrights-nav hide-in-mobile']/a");
		footer(footers, "GDPR");
	}
		
		public static void footer(By locator, String linktext) {
			
			List<WebElement> links =driver.findElements(locator);
			for (WebElement e : links) {
				String footerlink =e.getText();
				System.out.println(footerlink);
				if (footerlink.contains(linktext)) {
					e.click();
					break;
					
				}
				
			}
		}
		
	}

