package CrossBrowserTestingLogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws Exception {
		
		/*
		 * System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe");
		 * WebDriver driver = new ChromeDriver(); driver.get("https:\\www.google.com");
		 * String currenturl = driver.getCurrentUrl(); System.out.println(currenturl);
		 * String title= driver.getTitle(); System.out.println(title); driver.quit();
		 */
		String browser = "chrome";
		CrossBrowserTesting cb = new CrossBrowserTesting();
		
		cb.browser_Init(browser);
		//cb.windowMaximize();
		cb.getUrl("https://www.amazon.com");
		String pageTitle = cb.getPageTitle();
		if(pageTitle.equals("Amazon"))
		{
			System.out.println("Page title is correct");
		}
		String pageurl =cb.getPageUrl();
		if(pageurl.contains("amazon"))
		{
			System.out.println("page url is correct");
		}
		cb.closeBrowser();		
		
	}

}
