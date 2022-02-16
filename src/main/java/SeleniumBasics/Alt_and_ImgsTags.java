package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alt_and_ImgsTags {
	static WebDriver driver;
	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			
			
			/**
			 * Program for the total images and print the src  and alt tags
			 */
			List<WebElement> imgTags=driver.findElements(By.tagName("img"));
			int size = imgTags.size();
			System.out.println(size);
			for (WebElement e : imgTags) {
				String altval = e.getAttribute("alt");
				String src = e.getAttribute("src");
				System.out.println(altval+":"+ src);
				
			}
			
	}

}
