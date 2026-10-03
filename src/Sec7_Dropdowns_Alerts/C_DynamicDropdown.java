package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_DynamicDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Jabalpur (JLR)']")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).getText());	
		//driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).click(); //some people don't recommend using indexes.
		
		/*
		 * Using parent child relationship to find the element. // can also be used in the middle of 
		 * the xpath to directly locate child element and some elements with higher hierarchy can be 
		 * skipped.
		 */
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Kolkata (CCU)']")).click();
		
		driver.quit();
		
		
		
		
	}

}
