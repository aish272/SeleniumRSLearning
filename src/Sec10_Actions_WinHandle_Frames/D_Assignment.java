package Sec10_Actions_WinHandle_Frames;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author aish
 *
 */
public class D_Assignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[@href='/windows']")).click();
		String parentWindowHandleString = driver.getWindowHandle();
		driver.findElement(By.xpath("//div/h3/following-sibling::a")).click();
		Set <String> windowHandles = driver.getWindowHandles();
		Iterator<String> it = windowHandles.iterator();
		boolean flag = true;
		while(flag)
		{
			String winHandle= it.next();
			if (parentWindowHandleString.compareTo(winHandle)!=0)
			{
				driver.switchTo().window(winHandle);
				System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
				flag = false;
			}
			
		}
		driver.switchTo().window(parentWindowHandleString);	
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		driver.quit();	
		}
	

}
