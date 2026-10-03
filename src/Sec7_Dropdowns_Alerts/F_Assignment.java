package Sec7_Dropdowns_Alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class F_Assignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Q1
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());
		
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@value='option1']")).isSelected());

		
		//Q2
		
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkBox.size());
		driver.close();
	
	}

}
