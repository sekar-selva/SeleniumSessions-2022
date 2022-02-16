package SeleniumBasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorConcept {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement text =driver.findElement(By.linkText("Duncan, Canada"));
		String RightIndex =driver.findElement(with(By.tagName("p")).toRightOf(text)).getText();
		System.out.println(RightIndex);
		String LeftIndex =driver.findElement(with(By.tagName("p")).toLeftOf(text)).getText();
		System.out.println(LeftIndex);
		String BelowIndex =driver.findElement(with(By.tagName("p")).below(text)).getText();
		System.out.println(BelowIndex);
		List<WebElement> AboveIndex =driver.findElements(with(By.tagName("p")).above(text));
		for (WebElement e : AboveIndex) {
			System.out.println(e.getText());
		}
		
		System.out.println("------------>Near text<------------------ ");
		String NearIndex =driver.findElement(with(By.tagName("p")).near(text)).getText();
		System.out.println(NearIndex);
		
	}

}
