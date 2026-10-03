package Sec10_Actions_WinHandle_Frames;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B_KeyDown_DoubleClick {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions shiftKeyDown = new Actions(driver);
	
		//move to text box -> click -> hold shift key -> type (will type in caps because of holding shift)
	
		shiftKeyDown = shiftKeyDown.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().
		keyDown(Keys.SHIFT).sendKeys("Silver Jewelry");
		
		//double click and select the typed text
		
		// double click will only select jewelry because of the space between the two words
		//therefore using an extra click to select silver and jewelry.
		
		shiftKeyDown =   shiftKeyDown.doubleClick().click(); 
		
		//The actions performed on line 23, 24 and 31 will return Actions Class object but after 
		//using build (), it will return Action class object. Hence it can't be stored in shiftKeyDown.
		//shiftKeyDown is an Actions' class object.
		
		shiftKeyDown.build().perform();
		
		
	}

}
