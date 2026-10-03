package Sec9_Wait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class B_explicitWait {

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

	public static void main(String[] args) 

	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();

		
		
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] veggies = { "Cucumber", "Beetroot", "Brinjal" };
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[@class='product-name']")));
		addToCart(driver, veggies);
		
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promoCode")));
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("promoBtn")).click();
		
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		Assert.assertEquals(driver.findElement(By.className("promoInfo")).getText(), "Code applied ..!");
		
		driver.quit();
	}

}
