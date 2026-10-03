package Sec9_Wait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A_implicitWait {

	public static void addToCart(WebDriver driver, String[] veggies ) 
	{
		List<WebElement> veggieName = driver.findElements(By.xpath("//h4[@class='product-name']"));
		int numOfVeggies = 0;

		for (int i = 1; i <= veggieName.size(); i++) 
		{
			String Name = veggieName.get(i).getText();
			String[] formattedName = Name.split(" ");
			List<String> vegList = Arrays.asList(veggies);
			if (vegList.contains(formattedName[0]) && numOfVeggies < veggies.length) 
			{
				driver.findElement(By.xpath("//h4[text()='" + Name + "']/following-sibling::div[@class='product-action']/button"))
						.click();
				numOfVeggies++;
				System.out.println(Name);
				if (numOfVeggies == veggies.length) 
				{
					break;
				}
			}
		}

	
	}

	public static void main(String[] args) throws InterruptedException

	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //This will be applied to all the elements
		
		/*
		 * Con of implicit wait: If there is a 15 sec wait set universally because one element takes 15 sec
		 * to load then for all the elements the wait timeout will be 15 sec. In case there is one element
		 * which should not take more than 5 sec to be visible but it is taking 10 secs to show on UI. Then
		 * this error will not be caught because the script is waiting for 15 sec for all the elements. 
		 */
		
		String[] veggies = { "Cucumber", "Beetroot", "Brinjal" };
		
		addToCart(driver, veggies);
		
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		
		driver.quit();

	}

}
