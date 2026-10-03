/**
 * lecture 91
 */

package Sec11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_GetNumOfAllLinks_ScopeOfDriver {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");
		
		
		System.out.println("Number of all links on the page "+driver.findElements(By.tagName("a")).size());
		
		
		//changed the scope of webdriver. 
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		//Now it will only look for links in the footer section.
		System.out.println("Number of all links in the footer section: "+footerDriver.findElements(By.tagName("a")).size());
		
		driver.quit();

	}

}
