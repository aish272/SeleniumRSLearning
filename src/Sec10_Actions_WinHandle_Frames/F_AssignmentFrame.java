package Sec10_Actions_WinHandle_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class F_AssignmentFrame {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/nested_frames']")).click();
		
		//Switching to outer frame.
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name='frame-top']")));
		
		//Switching to inner frame.

		driver.switchTo().frame(driver.findElement(By.xpath("//frameset/frame[@name= 'frame-middle']")));
		String middleFrameText = driver.findElement(By.id("content")).getText();
		System.out.println(middleFrameText);
		Assert.assertEquals(middleFrameText, "MIDDLE");
		
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
