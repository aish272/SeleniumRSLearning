package Sec12_Scroll_TableGrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_GridAssignment {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();	
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table =  driver.findElement(By.xpath("//table[@name='courses']"));
		int totalRows =  table.findElements(By.tagName("tr")).size();
		int totalColumns =  table.findElements(By.tagName("th")).size();
		
		System.out.println("Colums:"+totalColumns+" Rows:"+totalRows);
		
		WebElement secondRow = table.findElement(By.xpath("//table[@name='courses']//tr[3]"));
		System.out.print("Instructor:"+secondRow.findElement(By.xpath("td[1]")).getText()+" ");
		System.out.print("Course:"+secondRow.findElement(By.xpath("td[2]")).getText()+" ");
		System.out.print("Price:"+secondRow.findElement(By.xpath("td[3]")).getText()+" ");
		driver.close();
		
		
		
	}

}
