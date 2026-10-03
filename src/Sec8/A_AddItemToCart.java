package Sec8;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_AddItemToCart {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] veggies = {"Cucumber", "Beetroot","Brinjal"};
		int numOfVeggies = 0;
		
		
		Thread.sleep(3000);
		
		List<WebElement> veggieName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=1; i<=veggieName.size();i++)
		{
			String Name = veggieName.get(i).getText();
			String[] formattedName = Name.split(" ");
			List <String> vegList = Arrays.asList(veggies);
			if(vegList.contains(formattedName[0]) && numOfVeggies<veggies.length)
			{
				driver.findElement(By.xpath("//h4[text()='"+Name+"']/following-sibling::div[@class='product-action']/button")).click();
				numOfVeggies++;
				System.out.println(Name);
				if (numOfVeggies== veggies.length)
				{
					break;
				}
			}
		}
		Thread.sleep(3000);
		
		driver.quit();
		
				
				
		

	}

}
