package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDownWithoutUsingSelectClass {
		static WebDriver driver;
		public static void main(String[] args) {
			
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			By country = By.xpath("//*[@name='Country']/option");
			
			List<WebElement> DropDownList=driver.findElements(country);
			for (WebElement e : DropDownList) {
				String text = e.getText();
				if (text.contains("India")) {
					e.click();
					break;
					
				}
				
			}
	}

}
