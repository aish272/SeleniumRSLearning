//l-47
package Sec6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author aishwarya
 *
 */
public class C_BrowserNavigation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		/*
		 * Usually at the start of the automation script driver.get() method is used because in this case 
		 * the script waits till the full page is loaded. This is done using an HTTP POST operation, 
		 * and the method will block until the load is complete. But in the case of navigate()
		 * this is not followed.
		 */
		driver.get("http://google.com");
		driver.navigate().to("https://rahulshettyacademy.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();

	}

}
