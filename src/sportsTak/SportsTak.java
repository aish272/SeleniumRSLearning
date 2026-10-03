package sportsTak;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SportsTak {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://thesportstak.com/");
		String parentWindowHandleString = driver.getWindowHandle();
		
		Thread.sleep(6000);
		//Change language. (Hindi)
		driver.findElement(By.xpath("//button[contains(@class,'btnLangToggle ')]/span")).click();
		
		Thread.sleep(6000);
		//Change language. (English)
		driver.findElement(By.xpath("//button[contains(@class,'btnLangToggle ')]/span")).click();
		
		Thread.sleep(3000);
		//Come back to original tab
		driver.findElement(By.xpath("//div[@role='tablist']//button[@id = 'scrollable-auto-tab-0' and @iconposition='end']")).click();
		
		Thread.sleep(3000);
		//driver.quit();
		
		//Broken Links
		
		SoftAssert assertBrokenLinks = new SoftAssert();
		List <WebElement> links = driver.findElements(By.xpath("//div[contains(@class,'MuiCardContent')]//a"));
		
		for(WebElement link : links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int statusCode = connection.getResponseCode();
			System.out.println(statusCode);
			assertBrokenLinks.assertTrue(statusCode<400, "The link with text "+link.getText()+" is broken.");
			
		}
		assertBrokenLinks.assertAll();
		
		//click on cricket
		
		driver.findElement(By.xpath("//div[contains(@class,'MuiCardContent')]//a")).click();
		for(int i =1;i<driver.findElements(By.tagName("a")).size();i++)
		{
			String controlAndEnter = Keys.chord(Keys.COMMAND,Keys.ENTER);
			
			driver.findElements(By.tagName("a")).get(i).sendKeys(controlAndEnter);
			
		    	
		    
		}
		
		Set <String> windowHandle = driver.getWindowHandles();
		Iterator <String> iterator = windowHandle.iterator();
		while (iterator.hasNext())
		{
			
			Assert.assertFalse(driver.switchTo().window(iterator.next()).getTitle().contains("Not Found"));
		}
		
		//switch theme
		
		driver.findElement(By.xpath("//button[contains(@class,'btnThemeToggle')]")).click();

	}

}
