package Sec7_Dropdowns_Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D_AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
		for(WebElement option: options)
		{
			
			if(option.getText().equalsIgnoreCase("India"))
			{
				System.out.println(option.getText());
				option.click();
				break;
			}
			
		}
		Thread.sleep(3000);
		driver.quit();

	}

}
