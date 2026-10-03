/**
 * Lecture 92, 93, 94
 */

package Sec11;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class B_OpenMutipleLinks_GetTitles {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");		
		
		//changed the scope of webdriver to footer section. 
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
		
		//changed the scope of web driver to leftmost column in the footer section. 
		WebElement leftCoulmnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

		
		for(int i =1;i<leftCoulmnDriver.findElements(By.tagName("a")).size();i++)
		{
			String controlAndEnter = Keys.chord(Keys.COMMAND,Keys.ENTER);
			
			leftCoulmnDriver.findElements(By.tagName("a")).get(i).sendKeys(controlAndEnter);
			
		    //Thread.sleep(5000L);		
		    
		}
		
		Set <String> windowHandle = driver.getWindowHandles();
		Iterator <String> iterator = windowHandle.iterator();
		while (iterator.hasNext())
		{
			System.out.println(driver.switchTo().window(iterator.next()).getTitle());
		}	
	}

}
