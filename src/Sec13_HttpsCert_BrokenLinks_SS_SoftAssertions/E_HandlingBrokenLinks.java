package Sec13_HttpsCert_BrokenLinks_SS_SoftAssertions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class E_HandlingBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		SoftAssert assertBrokenLinks = new SoftAssert();
		List <WebElement> links = driver.findElements(By.xpath("//div[contains(@class,'footer')]//tbody//a"));
		
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
		driver.quit();

	}

}
