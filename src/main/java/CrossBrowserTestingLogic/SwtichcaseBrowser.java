package CrossBrowserTestingLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class SwtichcaseBrowser {
	private WebDriver driver;
	
	public WebDriver launch_Browser()
	{
		System.out.println("Launch the browser");
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.chrome.driver", "D:\\Jars\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.chrome.driver", "D:\\Jars\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		case "opera":
			System.setProperty("webdriver.chrome.driver", "D:\\Jars\\operadriver.exe");
			driver = new OperaDriver();
			break;

		default:
		{
			System.out.println("Please pass the correct browser :" +browser);
		}	
		}
		return driver;
	}	
		public void passUrl(String url) throws Exception
		{
			if (url.contains("https") || url.contains("http")) {
				driver.get(url);
			}
			else
			{
				System.out.println("Please pass the correct url");
				try {
				throw new Exception("Invalid url format : http/https is missing");
				}
				catch (Exception e) {
				
				}
		}
	}
		public void maximixeBrowser()
		{
			driver.manage().window().maximize();
			
		}
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	public void closeBrowser()
	{
		driver.quit();
	}
}
