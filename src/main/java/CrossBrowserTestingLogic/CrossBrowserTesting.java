package CrossBrowserTestingLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {
	private WebDriver driver;

	
	// this will be called as Utility class also
	/**
	 * To initialize the browser driver on the basis of the browsername
	 * 
	 * @param browser
	 * @return returns the web driver
	 */
	public WebDriver browser_Init(String browserName) {

		System.out.println("Browser name is:" + browserName);

		/*
		 * if (browser.equals("chrome")) { System.setProperty("webdriver.chrome.driver",
		 * "D:\\Jars\\chromedriver.exe"); driver = new ChromeDriver(); } else if
		 * (browser.equalsIgnoreCase("firefox")) {
		 * System.setProperty("webdriver.gecko.driver", "D:\\Jars\\geckodriver.exe");
		 * driver = new FirefoxDriver(); } else if (browser.equalsIgnoreCase("edge")) {
		 * System.setProperty("webdriver.edge.driver", "D:\\Jars\\msedgedriver.exe");
		 * driver = new EdgeDriver(); } else {
		 * System.out.println("Please pass the correct browser"); } return driver;
		 */
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
	/*
	 * public WebDriver windowMaximize() { driver.manage().window().maximize();
	 * return driver; }
	 */

	/**
	 * To pass the url in the address bar of the browser
	 * @param url
	 * @throws Exception 
	 */
	public void getUrl(String url) throws Exception {
		System.out.println("the url is:" + url);
		if (url.contains("http") || url.contains("https")) 
		{
			driver.get(url);
		} 
		else 
		{
			System.out.println("Please pass the correct url:" + url);
			throw new Exception("Incorrect url format : Missing http or https");
		}
	}
	/**
	 * To get the page title
	 * @param title
	 * @return title
	 */
		public String getPageTitle() {
			return driver.getTitle();
		}
		/**
		 * Get the page current url
		 * @param url
		 * @return page url
		 */
		public String getPageUrl()
		{
			return driver.getCurrentUrl();
		}
		
		public void closeBrowser()
		{
			driver.close();
		}
	
	}

