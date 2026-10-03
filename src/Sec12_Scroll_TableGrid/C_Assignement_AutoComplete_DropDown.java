package Sec12_Scroll_TableGrid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_Assignement_AutoComplete_DropDown 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("un");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[contains(@id,'ui-id-1')]/li/div"));
		System.out.println(suggestions.size());
		for(int i=0;i<suggestions.size();i++)
		{
			if(suggestions.get(i).getText().contains("United States (USA)"))
			{
				suggestions.get(i).click();
				System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
				break;
			}
			
		}
		
	}

}
