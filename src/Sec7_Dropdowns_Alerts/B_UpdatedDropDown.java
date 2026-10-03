package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_UpdatedDropDown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		int numOfAdults = 4;
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); //Get num of adults selected by default.
		
		while(numOfAdults-1>0) // numOfAdults-1 -> subtracting 1 because 1 adult is already selected by default
		{
			//Click on + icon to increase number of adult passengers.
			driver.findElement(By.id("hrefIncAdt")).click();
			numOfAdults--;
		}
		
		//Get num of adults selected by clicking on (+) icon associated with 'Adult' option multiple times.
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.quit();

	}

}
