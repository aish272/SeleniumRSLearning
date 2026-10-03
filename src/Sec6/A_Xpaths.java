//l-40
package Sec6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A_Xpaths {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String Expected_msg = "You are successfully logged in.";	
		/*
		  Implicit wait won't wait here because the sign page already contains p tag element, so it will
		  continue it's execution. This may give error and me may not get the desired p tag. To resolve this 
		  I used Thread.sleep, so that it waits for the next page and gets p tag from there. Watch l-40 
		  to understand if still have doubts.
		  */
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),Expected_msg);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Log Out')]")).click();
		driver.quit();
	
	
	}

}

