package testProcure360;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Procure360_Common {
	
	private WebDriver driver;
	public WebDriver launchBrowser(String browserName)
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();		
		}
		else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please pass the right browser");
		}
		
		return driver;
	}
		public void getUrl(String url)
		{
			if(url.contains("http") || url.contains("https"))
			{
			driver.get(url);
			}
			else {
				System.out.println("Please pass the correct URL format"+url);
			}
		}
			

}
