package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class J_Assignment2 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Name");
		driver.findElement(By.name("email")).sendKeys("NunyaBusiness");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Fountain");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropDown = new Select(genderDropdown);
		dropDown.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.xpath("//input[@type='date']")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("27062000");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'alert-success')]")).getText());
		
		driver.quit();
		
		
	}
}
