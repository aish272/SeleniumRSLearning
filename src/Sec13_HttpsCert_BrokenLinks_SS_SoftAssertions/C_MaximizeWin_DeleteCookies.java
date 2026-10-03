package Sec13_HttpsCert_BrokenLinks_SS_SoftAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C_MaximizeWin_DeleteCookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//to delete a particular cookie
		//driver.manage().deleteCookieNamed("");
		
		driver.get("https://expired.badssl.com/");
		driver.quit();
	}

}
