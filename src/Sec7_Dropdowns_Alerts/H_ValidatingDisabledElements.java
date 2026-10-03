package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class H_ValidatingDisabledElements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Is enabled method will return true even when the element is disabled. 
		System.out.println(driver.findElement(By.xpath("//input[contains(@class,'home-date-pick')]")).isEnabled());
		
		//Using get attribute to observe changes before and after selection
		
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
		
		if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("display: block; opacity: 1")) 
		{
			Assert.assertTrue(true);
			System.out.println("Passed");
		}
		
		else
		{
			Assert.assertFalse(false);
			System.out.println("Failed");
		}
		
		driver.quit();
		
	}

}
