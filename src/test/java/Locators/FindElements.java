package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
				
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(2000);
		
		List<WebElement> Community_poll = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement web : Community_poll)
		{
			web.click();
			Thread.sleep(1000);
		}
	}

}
