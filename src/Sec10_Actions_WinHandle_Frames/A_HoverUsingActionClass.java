package Sec10_Actions_WinHandle_Frames;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class A_HoverUsingActionClass {

	public static void main(String[] args)   
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions hoverAction = new Actions(driver);
		
		Actions toBuild=hoverAction.moveToElement(driver.findElement(By.xpath("//a[@id='icp-nav-flyout']/span[@class=\"icp-nav-link-inner\"]")));
		
		//using build() on "Actions" class object was giving error. build() returns an object which 
		//belongs to "Action" class.
		Action toPerform = toBuild.build(); 
		toPerform.perform();
		
		driver.quit();
		

	}

}
