package Sec9_Wait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D_Assignment_EndToEndLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		
		driver.findElement(By.xpath("//span/following-sibling::input[@value='user']/following-sibling::span")).click();
		
		WebDriverWait explicitwait= new WebDriverWait(driver,Duration.ofSeconds(5));
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		Select role = new Select(driver.findElement(By.xpath("//select[@class = 'form-control']")));
		role.selectByValue("consult");
		
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class,'btn-primary')]")));
		
		List <WebElement> items = driver.findElements(By.xpath("//button[contains(@class,'btn-info')]"));
		
		for (int i =items.size();i>0;i-- )
		{
			driver.findElement(By.xpath("(//button[contains(@class,'btn-info')])"+"["+i+"]")).click();
		}
		
		driver.findElement(By.xpath("//a[contains(@class,'btn-primary')]")).click();
		
		driver.close();
	}

}
