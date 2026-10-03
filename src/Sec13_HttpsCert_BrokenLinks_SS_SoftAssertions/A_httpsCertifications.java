package Sec13_HttpsCert_BrokenLinks_SS_SoftAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A_httpsCertifications {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		//FirefoxOptions options2 = new FirefoxOptions();
		//EdgeOptions options3 = new EdgeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000); //added to see the execution
		
		driver.quit();
	}

}
