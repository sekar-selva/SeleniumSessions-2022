package Apptestcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;

	@Parameters({ "browser", "url" })
	@BeforeTest
	public void setUp(String browserName, String url) {

		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		// if we want to add time out globally then we can add this into the xml file with the parameter as name as time out and value as second, the
		// the same thing has to pass this setup method and then have to parse the sting to integer because in xml file everything is string
		// so have to convert into Interger.parseInt(timeout)
		driver.get(url);
		// max value of verbose is 10 and min 1. 

	}

	@AfterTest
	public void tearDown() {
		driver.quit();

	}

}
