package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryCheckBox {
	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
		By choices = By.xpath("//span[@class='comboTreeItemTitle']");
		// ---> for single selection use this 
		//selectChoice(choices, "choice 2"); 
		
		//---> for multi selection
				selectChoice(choices, "choice 1", "choice 2");
		// ----> for all the check box selection 
		//selectChoice(choices, "SELECT ALL");
	}
		public static void selectChoice(By locator, String... value) // we can use triple dot(...) or string array[] like this and both are same
		{
			List<WebElement>choiceList=driver.findElements(locator);
			boolean flag = false;
			if(!value[0].equalsIgnoreCase("select all"))
			{
			for (WebElement e : choiceList) {
				String checkboxtextList = e.getText();
				//System.out.println(checkboxtextList);
				
				for(int i =0; i<value.length;i++) {
					if (checkboxtextList.equals(value[i])) {
						flag= true;
						e.click();
						break;
					}
				}
			}
			}
					else
					{
						try
						{
						for (WebElement e : choiceList) {
							e.click();
							flag = true;
						}
					}
						catch (ElementNotInteractableException e) {
							System.out.println("All the choices are checked");
						}
					
				}
			if (flag == true) {
				System.out.println("Choice is not available here:"+value[0]);
				
			}
			}
}
		
/// this program we have to modify again, 
	


