package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConcept {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
		String text = driver.findElement(By.id("tinymce")).getText();
		System.out.println(text);
		

	}

}
