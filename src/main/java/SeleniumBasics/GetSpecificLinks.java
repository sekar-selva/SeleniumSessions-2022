package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetSpecificLinks {

		static WebDriver driver;
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:www.google.co.in");
		List<WebElement> langList=driver.findElements(By.xpath("//*[@id='SIvCob']/a"));
		/*for(int i=0; i<=langList.size();i++)
		{
			String text =langList.get(i).getText();
			System.out.println(text);	
			if (text.contains("தமிழ்")) {
				text.click(); // here click is not working so going to use for each loop
				
			}*/
		for (WebElement e : langList) {
			String text =e.getText();
			System.out.println(text);
			if (text.contains("தமிழ்")) {
				e.click();
				break;
				
			}
			
			
			
		}
		}

	}

