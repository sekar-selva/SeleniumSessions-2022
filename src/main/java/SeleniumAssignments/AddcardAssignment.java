package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddcardAssignment {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/inventory.html");
		By UserName = By.id("user-name");
		By Password = By.id("password");
		By loginButton = By.id("login-button");

		doSendKeys(UserName, "standard_user");
		doSendKeys(Password, "secret_sauce");
		doclick(loginButton);
		
		  //List<WebElement> ItemPrice = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
			/*
			 * List<WebElement> Price =
			 * driver.findElements(By.xpath("//div[@class='pricebar']"));
			 * 
			 * for (WebElement e : Price) { String text =e.getText(); String values
			 * =text.replace("ADD TO CART", ""); System.out.println(values); values.s
			 */
		List<WebElement> items = driver.findElements(By.className("inventory_item_price"));
		double largest = 0;
		for (WebElement e : items) {
			double price = Double.parseDouble(e.getText().replace("$", ""));
			if (largest < price) {
				largest = price;
			}
		}
		driver.findElement(By.xpath("//div[normalize-space()='$" + largest + "']/following-sibling::button")).click();
			
		}
			
		
		 
		 

	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}

	public static void doclick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();

	}
}
