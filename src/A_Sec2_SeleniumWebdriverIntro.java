import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Lecture 11

public class A_Sec2_SeleniumWebdriverIntro {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://strasberg.edu/");
		System.out.println(	driver.getTitle()); //getTitle returns title of the page
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
