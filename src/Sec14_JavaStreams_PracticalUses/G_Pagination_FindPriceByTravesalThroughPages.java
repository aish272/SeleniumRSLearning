package Sec14_JavaStreams_PracticalUses;

import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class G_Pagination_FindPriceByTravesalThroughPages {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/aish/Documents/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column header to sort the list
		driver.findElement(By.xpath("//thead//th[1]")).click();
		List <String> priceOfRice;
		String desiredCommodity = "Ricemeal";
		do {
			WebElement nextButton = driver.findElement(By.xpath("//a[@role='button' and @aria-label='Next']"));
			List<WebElement>listOfVegNames = driver.findElements(By.xpath("//tbody/tr/td[1]"));
			priceOfRice = listOfVegNames.stream().filter(webEle->webEle.getText().equals(desiredCommodity))
					.map(webEle->getPrice(webEle)).collect(Collectors.toList());
			
			nextButton.click();
			if(nextButton.getAttribute("aria-disabled").equals("true") && priceOfRice.size()==0)
			{
				listOfVegNames = driver.findElements(By.xpath("//tbody/tr/td[1]"));
				priceOfRice = listOfVegNames.stream().filter(webEle->webEle.getText().equals(desiredCommodity))
						.map(webEle->getPrice(webEle)).collect(Collectors.toList());
				if (priceOfRice.size()==0)
				{
					System.out.println(desiredCommodity+" not present in any page.");	
					break;
				}
		
			}       						
		}while(priceOfRice.size()==0); //if priceoFRice is empty that means we need to traverse through the next pages till we get rice element
		
		if(priceOfRice.size()==1)
		System.out.println("Price of rice"+priceOfRice.get(0));
		
		
		
		driver.quit();
		

	}
	
	public static String getPrice(WebElement vegElement)
	{
		String price = vegElement.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}

}
