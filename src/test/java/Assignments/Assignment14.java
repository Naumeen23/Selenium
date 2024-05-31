package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment14 {

		// to get address of child window remove parent window 1st then get child window address
        public static void main(String[] args) throws InterruptedException {
       // open empty chrome browser
		WebDriver driver = new ChromeDriver();
		
		// maximize the window
		driver.manage().window().maximize();
		
		//get into url
		driver.get ("https://demowebshop.tricentis.com/");
		
		// for parenet handle
		String parent_handle = driver.getWindowHandle();
		System.out.println("DWs page====>"+parent_handle);
		
		// create action object
		Actions action = new Actions(driver);
		
      	// perform keyboard action
		action.keyDown (Keys.TAB).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(1000);
		
		Set<String> child = driver.getWindowHandles();
		
		String given_url="https://www.facebook.com/nopCommerce";
		
		for (String str : child) {
			
			driver.switchTo().window(str);
			
			String current_url=driver.getCurrentUrl();
			
			if (current_url.equals(given_url)) {
				
				 driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("aishwarya@gmail.com");
			}
		}
	}

}


