package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class, 'context-menu-icon')]"));
		for (WebElement e : list) {
			String text =e.getText();
			System.out.println(text);
			if (text.equals("Delete")) {
				e.click();
				break;
				
			}
		}
	}

}
