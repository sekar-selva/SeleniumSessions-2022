package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDropdownValuesIndex {

		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.chromiumdriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
			By country = By.id("Form_submitForm_Country");
			By state = By.id("Form_submitForm_State");
			
			Select select = new Select(driver.findElement(country));
			List<WebElement> dropdownlist=select.getOptions();
			int counter =0;
			for (WebElement e : dropdownlist) {
				System.out.println(counter+":"+e.getText());
				counter++;
				
				
			}
			
				
			}
				
			}
			

	


