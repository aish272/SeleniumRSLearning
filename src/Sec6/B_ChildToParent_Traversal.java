//l-46
package Sec6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_ChildToParent_Traversal {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();
		String LogInButton = driver.findElement(By.xpath("//header/div/a/parent::div/button[2]")).getText();
		System.out.println(LogInButton);
		driver.quit();
	}

}
