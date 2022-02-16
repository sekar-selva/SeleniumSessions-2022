package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_Select {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");
		By state = By.id("Form_submitForm_State");
		/*
		 * WebElement country_loc = driver.findElement(country); WebElement state_loc =
		 * driver.findElement(state);
		 * 
		 * Select select = new Select(country_loc); select.selectByIndex(5);
		 * select.selectByVisibleText("India"); Thread.sleep(3000); Select select1= new
		 * Select(state_loc); select1.selectByVisibleText("Tamil Nadu");
		 */
			//doSelectByIndex(country, 4);
			//doSelectByIndex(state, 5);
		doSelectByVisibleText(country, "India");
		Thread.sleep(3000);
		doSelectByVisibleText(state, "Goa");
			
	}
	
	public static WebElement getElement(By locator) 
	{
		return driver.findElement(locator);
	}
	public static void doSelectByIndex(By locator, int index){
		Select select = new Select(getElement(locator));
		
		select.selectByIndex(index);
	}
	
	public static void doSelectByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

}
