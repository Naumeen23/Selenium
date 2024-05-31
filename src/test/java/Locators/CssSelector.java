package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/fiction");
			
			driver.findElement(By.id("small-searchterms")).sendKeys("watches");
			
			driver.findElement(By.cssSelector("input[type='submit']")).click();
			
			
			


	}

}
