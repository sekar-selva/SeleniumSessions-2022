package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/bonigarcia/webdrivermanager");
		String title =driver.getTitle();
		System.out.println(title);
		driver.quit();
		driver.getTitle();
		driver.getPageSource();
		driver.close();
		

	}

}
