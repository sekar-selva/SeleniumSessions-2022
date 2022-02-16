package CrossBrowserTestingLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDManager {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		//WebDriverManager.chromedriver().browserVersion("87.0").setup(); // we can use this via older browser versions but this is not currenly required
		// it can download the version automatically but you have the same verison of browser in your pc
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com");
		driver.close();
		driver.getPageSource();
	}

}
