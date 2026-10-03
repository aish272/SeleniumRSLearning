package Sec14_JavaStreams_PracticalUses;

import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class H_TestFilterFunctinality 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		
		driver.findElement(By.xpath("//input[@id='search-field']")).sendKeys("apple");
		List<WebElement> displayedListAfterSearch = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<String> actDisplayedListAfterSearch = displayedListAfterSearch.stream().map(ele->ele.getText()).map(ele->ele.toLowerCase()).collect(Collectors.toList());
		
		List<String> expDisplayedNamesAfterSearch = displayedListAfterSearch.stream().map(ele->ele.getText()).map(ele->ele.toLowerCase()).
												 filter(names->names.contains("apple")).collect(Collectors.toList());
		
		System.out.println(actDisplayedListAfterSearch);
		System.out.println(expDisplayedNamesAfterSearch);
		
		Assert.assertTrue(actDisplayedListAfterSearch.equals(expDisplayedNamesAfterSearch), "Search functinality not working properly");
		
		driver.quit();

		
	}

}
