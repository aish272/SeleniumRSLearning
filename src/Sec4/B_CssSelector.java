package Sec4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_CssSelector {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("aish@com");
		driver.findElement(By.name("inputPassword")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(5000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.findElement(By.xpath("//form/input[@placeholder='Name']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//form/input[@placeholder='Email']")).sendKeys("123@g.com");
		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("677");
		//Using sleep so that after the window is switched on the right, there is no
		//error in clicking reset password button.		
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.quit();	
		
		//tried to extract password. This worked!
		int start = "Please use temporary password 'rahulshettyacademy' to Login.\n".indexOf("'");
		int begin = "Please use temporary password 'rahulshettyacademy' to Login.\n".lastIndexOf("'");
		String pwd = "Please use temporary password 'rahulshettyacademy' to Login.\n".substring(start+1,begin);
		System.out.println(pwd);
	}

}
