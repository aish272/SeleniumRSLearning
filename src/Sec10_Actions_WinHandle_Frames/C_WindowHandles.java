package Sec10_Actions_WinHandle_Frames;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_WindowHandles 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		String parentWindowHandleString = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set<String> windowHandles  = driver.getWindowHandles();
		Iterator <String> it = windowHandles.iterator();
		Boolean flag = true;
		while(flag)
		{
			String Windowhandle = it.next();
			if(parentWindowHandleString.compareTo(Windowhandle)!=0)
			{
				driver.switchTo().window(Windowhandle);
				flag = false;
			}
		}
		System.out.println(driver.findElement(By.xpath("//p/strong/a")).getText());
		driver.close();
		
	}
}
