package Sec11;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C_Assignment {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();		
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebElement checkboxlabel = driver.findElement(By.xpath("//input[@id='checkBoxOption2']/parent::label"));	
		String labelText = checkboxlabel.getText();
		labelText= labelText.trim();
		System.out.println("text"+labelText);
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
		Select dropDown = new Select(driver.findElement(By.id("dropdown-class-example")));
		dropDown.selectByVisibleText(labelText);
		
		driver.findElement(By.id("name")).sendKeys(labelText);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alertText = driver.switchTo().alert().getText();
		
		if(alertText.contains(labelText))
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		driver.quit();
		
	}

}
