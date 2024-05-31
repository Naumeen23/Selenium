package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
		driver.manage().window().maximize();
				
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Rashid Mubarak");
//		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
		//by using xpath by text function
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//By using xpath by contains function
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();

	}

}
