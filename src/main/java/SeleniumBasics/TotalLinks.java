package SeleniumBasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		  // if you want to get all the links you have to use
		  int c =0;
		  List<WebElement> pageLinks=driver.findElements(By.tagName("a")); 
		  // driver.find elts will give list of web elements
		  System.out.println("Total number of links in the page:"+pageLinks.size()); 
		  // to print all the links have to use for loop and for each loop also int c =0;
		  for (WebElement e : pageLinks) 
		  { 
			  String linktext =e.getText(); 
			  if (!linktext.isEmpty()) { 
				  System.out.println(c+":"+linktext); 
				  } 
			  String hrefVal= e.getAttribute("href"); 
			  System.out.println(hrefVal); 
			  c++; 
			  }
		  
		 
		  	// same the have to write it with the typical for loop
		  	

			List<WebElement> listoflinks	=driver.findElements(By.tagName("a"));		
				int listsize=listoflinks.size();
				System.out.println("Links list is :"+listsize);
				for(int i =0; i<=listsize;i++)
				{
					String text1 = listoflinks.get(i).getText();
					System.out.println(i +";"+listoflinks);
				}
		  
		  
		  
		  
		  
		  
			}
	}

