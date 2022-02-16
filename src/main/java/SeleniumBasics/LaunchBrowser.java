package SeleniumBasics;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// this is automation process
		
		System.setProperty("webdriver.chrome.driver", "D:\\Jars\\chromedriver.exe"); // it will start the selenium server internally
		WebDriver driver = new ChromeDriver();  // topcasting
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.1.1"); // without http or https it wont work and 
		//without www. it will work but without https it wont launch and it will give invalid arg exception
		String title =driver.getTitle();
		System.out.println("Title is:"+title);
		// this is verification process - 
		if(title.contains("maven"))
		{
			System.out.println("The page title is correct");
		}
		else
		{
			System.out.println("Wrong page title");
		}
		
		// this entire thing is called automation testing
		driver.close();
	}

}
