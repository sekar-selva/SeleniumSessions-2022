package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooter {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https:www.google.com");
		By element = By.xpath("//*[@class='KxwPGc SSwjIe']/div//a");
		GoogleFooter(element, "Terms");
	}

	public static void GoogleFooter(By locator, String linkText)
	{
		List<WebElement> fl=driver.findElements(locator);
		for (WebElement e : fl) {
			String text = e.getText();
			System.out.println(text);
			if (text.contains(linkText)) {
				e.click();
				break;
				
				
			}
		}
	}
}
