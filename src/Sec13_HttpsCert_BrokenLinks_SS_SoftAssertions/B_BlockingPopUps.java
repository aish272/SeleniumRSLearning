package Sec13_HttpsCert_BrokenLinks_SS_SoftAssertions;

import java.io.File;
import java.util.Arrays;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B_BlockingPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		
		//block popups
		options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));	
			
		// Add the WebDriver proxy capability.
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);
				
		// Add a ChromeDriver-specific capability.
		options.addExtensions(new File("/path/to/extension.crx"));
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.justdial.com/");
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(9000); //added to see the execution
		
		
		
		driver.quit();

	}

}
