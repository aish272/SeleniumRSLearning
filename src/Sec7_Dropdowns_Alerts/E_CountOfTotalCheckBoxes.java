package Sec7_Dropdowns_Alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E_CountOfTotalCheckBoxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		// asserting that whether check box is selected or not before clicking. Using
		// syso is not recommended
		Assert.assertFalse(
				driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'friendsandfamily')]"))
						.isSelected());
		System.out.println(
				driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'friendsandfamily')]"))
						.isSelected());

		// Clicking on check box
		String str = "friendsandfamily";
		driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'" +str+ "')]")).click();

		// asserting that whether check box is selected or not after clicking. Using
		// syso is not recommended
		Assert.assertTrue(
				driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'friendsandfamily')]"))
						.isSelected());
		System.out.println(
				driver.findElement(By.xpath("//input[@type='checkbox' and contains(@name,'friendsandfamily')]"))
						.isSelected());
		driver.quit();

	}

}
