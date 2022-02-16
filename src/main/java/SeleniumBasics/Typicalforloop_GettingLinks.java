package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Typicalforloop_GettingLinks {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com");
		int count = 0;
			List<WebElement> pageLinks=driver.findElements(By.tagName("a"));
			int pageLinks_Size = pageLinks.size();
			System.out.println(pageLinks_Size);
			for (WebElement e : pageLinks) {
				String pageLinksText =e.getText();
				if (!pageLinksText.isEmpty()) {
					System.out.println(count +"::"+pageLinksText);	
				}
				count++;
			}

	}

}
