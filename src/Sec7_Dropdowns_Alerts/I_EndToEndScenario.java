package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class I_EndToEndScenario {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Click on dropdown to select departure city
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//Select departure city
		driver.findElement(By.xpath("//a[@text='Jabalpur (JLR)']")).click();
		
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).getText());	
		
		//driver.findElement(By.xpath("(//a[@text='Kolkata (CCU)'])[2]")).click(); //some people don't recommend using indexes.
		
		/*
		 * Using parent child relationship to find the element. // can also be used in the middle of 
		 * the xpath to directly locate child element and some elements with higher hierarchy can be 
		 * skipped.
		 */
		
		//Select destination city
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@text='Kolkata (CCU)']")).click();
		
		//Select today's date
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		
		Thread.sleep(2000);
		
		//Click dropdown for number of passengers
		driver.findElement(By.id("divpaxinfo")).click();
		int numOfAdults = 4;
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //Get num of adults selected by default.
		
		while(numOfAdults-1>0) // numOfAdults-1 -> subtracting 1 because 1 adult is already selected by default
		{
			//Click on + icon to increase number of adult passengers.
			driver.findElement(By.id("hrefIncAdt")).click();
			numOfAdults--;
		}
		
		//Get num of adults selected by clicking on (+) icon associated with 'Adult' option multiple times.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
		//Close button for number of passengers dropdown
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//Clicking on check box 
		driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'friendsandfamily')]")).click();
				
		//asserting that whether check box is selected or not after clicking. Using syso is not recommended 
		Assert.assertTrue(driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'friendsandfamily')]")).isSelected());
	
		
		Thread.sleep(2000);
		//Search button
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		
		driver.close();
		
	}

}
