package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A_StaticDropdown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select staticDropdown = new Select(dropDown);
		Thread.sleep(3000); // To see the execution.
		staticDropdown.selectByIndex(1);
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByVisibleText("USD");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		staticDropdown.selectByValue("AED");
		System.out.println(staticDropdown.getFirstSelectedOption().getText());
		driver.quit();

	}

}
