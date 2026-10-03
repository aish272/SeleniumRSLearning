package Sec12_Scroll_TableGrid;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class A_Scrolling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(3000);
		
		jse.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		int total = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(" ")[3]);
		
		List<WebElement> values = driver.findElements(By.xpath("//div[@class='tableFixHead']//table[@id='product']//td[4]"));
		
		int sum =0;
		for(int i =0;i<values.size();i++)
		{
			sum = sum+Integer.parseInt(values.get(i).getText());
		}
		
		Assert.assertEquals(total,sum);
	}

}
