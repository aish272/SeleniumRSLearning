package Sec10_Actions_WinHandle_Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class E_Frames_DragDrop {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		//Driver can switch to frame using its index, but not recommended because number of frames can change.
		driver.switchTo().frame(0);
		
		Actions dragDrop = new Actions(driver);
		WebElement draggable = driver.findElement(By.id("draggable"));		
		WebElement droppable = driver.findElement(By.id("droppable"));		
		dragDrop.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().defaultContent();	
		
	}

}
