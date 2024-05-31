package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 String given_data = "https://demowebshop.tricentis.com/fiction";
		 WebDriver driver = new ChromeDriver();
			
		 driver.manage().window().maximize();
				
		 driver.get("https://demowebshop.tricentis.com/fiction");
		 Thread.sleep(2000);
		 
		 String current_url = driver.getCurrentUrl();
		 
		 if(given_data.equals(current_url))
		 {
			 System.out.println("I am in DWS page");
			 
//			 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[1]/a")).click();
			 
//			 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[2]/a")).click();
			 
//			 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[3]/a/span[1]")).click();
			 
			 
			 driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/ul/li[4]/a/span[1]")).click();
		 }
		 else
		 {
			 System.out.println("Page not found");
		 }
	}

}
