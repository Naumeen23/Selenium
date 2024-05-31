package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
			
		driver.get("https://www.naukri.com/");
		String givenUrl = "https://www.naukri.com/";
		String currentUrl = driver.getCurrentUrl();
		
		if(givenUrl.equals(currentUrl))
		{
			driver.findElement(By.xpath("//a[text()='Register']")).click();
			
			driver.findElement(By.id("name")).sendKeys("Naumeen Sameer Takildar");
			
			driver.findElement(By.id("email")).sendKeys("naumeenst@gmail.com");
			
			driver.findElement(By.id("password")).sendKeys("Nomo@123");
			
			driver.findElement(By.id("mobile")).sendKeys("8055289544");
			
			
			
		}
	}

}
