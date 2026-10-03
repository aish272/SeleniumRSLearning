package Sec13_HttpsCert_BrokenLinks_SS_SoftAssertions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class D_Screenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/search?q=bajirao+mastani&rlz=1C5CHFA_enIN1000IN1000&sxsrf=ALiCzsY3yvBJrU0hUjQurpafLh3jE5arYg:1662873869495&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjUo7Dy_4v6AhXO8zgGHUAhAjEQ_AUoAXoECAIQAw&biw=1440&bih=789&dpr=2#imgrc=BaeQloPNupCtbM");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("/Users/aish/Documents/Selenium/Screenshot/ss.png"));
		
		driver.quit();
	}

}
