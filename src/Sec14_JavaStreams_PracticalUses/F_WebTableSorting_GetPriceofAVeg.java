package Sec14_JavaStreams_PracticalUses;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class F_WebTableSorting_GetPriceofAVeg {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		/**
		 * Web Table sorting. To verify whether the tables gets sorted after
		 * clicking on column header.
		 * 
		 */
		//Click on column to sort the webTable 
		
		driver.findElement(By.xpath("//thead//th[1]")).click();
		
		List<WebElement>listOfVegNames = driver.findElements(By.xpath("//tbody/tr/td[1]"));
		
		//Get Original list
		List<String>vegNamesOriginal = listOfVegNames.stream().map(webEle->webEle.getText()).collect(Collectors.toList());
		
		
		//get sorted list. Sorted the original list.
		List<String>vegNamesSorted = vegNamesOriginal.stream().sorted().collect(Collectors.toList());
		
		
		//Compare the original and the sorted list
		Assert.assertTrue(vegNamesOriginal.equals(vegNamesSorted));
		
		System.out.println("Original: "+vegNamesOriginal+"\n"+"Sorted: "+vegNamesSorted);
		
		/**
		 * Get the price of a veggie after sorting the table.
		 */
		 
		//Getting the web element which has name banana
		List <WebElement> bananaWebElement =  listOfVegNames.stream().filter(webEle->webEle.getText().equals("Banana")).collect(Collectors.toList());
		String priceOfbanana =  bananaWebElement.get(0).findElement(By.xpath("following-sibling::td[1]")).getText();
		
		System.out.println("priceOfbanana: "+priceOfbanana);
		driver.quit();
	}

}
