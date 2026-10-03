package Sec11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class D_HandlingCalendarUI {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']")).getText().contains("March"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		List<WebElement> allDays = driver.findElements(By.xpath("//td[@class='active day' or @class = 'day']"));
		for(int i = 0; i<allDays.size();i++) {
			if(allDays.get(i).getText().equals("18"))
			{
				allDays.get(i).click();
				break;
			}
		}
		System.out.println(driver.findElement(By.id("travel_date")).getText());
			
	}

}
