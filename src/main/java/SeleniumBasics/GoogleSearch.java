package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Elon");
		Thread.sleep(3000);
		List<WebElement> SearchList = driver.findElements(By.xpath("//*[@role='listbox']//div[@class='wM6W7d']/span"));
		System.out.println(SearchList.size());
		for (WebElement e : SearchList) {
			String listText = e.getText();
			System.out.println(listText);
			if (listText.contains("elon musk quotes")) {

				e.click();
				break;

			}

		}

	}

}
