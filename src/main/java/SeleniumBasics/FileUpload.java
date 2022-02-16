package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		By fileupload = By.id("file-upload");
		By submit = By.id("file-submit");
		driver.findElement(fileupload).sendKeys("C:\\Users\\Sekar S\\Downloads\\sherman.jpg");
		driver.findElement(submit).click();
	}

}
