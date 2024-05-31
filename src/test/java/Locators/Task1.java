package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
				
			driver.get("https://demowebshop.tricentis.com/fiction");
			String givenUrl = "https://demowebshop.tricentis.com/fiction";
			String currentUrl = driver.getCurrentUrl();
			
			if(givenUrl.equals(currentUrl))
			{
			
			WebElement register = driver.findElement(By.className("ico-register"));
			register.click();
			String givenTitle = "Demo Web Shop. Register";
			String currentTitle = driver.getTitle();
			
			if(givenTitle.equals(currentTitle))
			{
			
			driver.findElement(By.id("gender-female")).click();
			
			driver.findElement(By.name("FirstName")).sendKeys("Naumeen");
			
			driver.findElement(By.name("LastName")).sendKeys("Takildar");
			
			driver.findElement(By.id("Email")).sendKeys("naumeenst@gmail.com");
			
			driver.findElement(By.name("Password")).sendKeys("Nomo@123");
			
			driver.findElement(By.name("ConfirmPassword")).sendKeys("Nomo@123");
			
			driver.findElement(By.id("register-button")).click();
			
			driver.findElement(By.cssSelector("img[alt='Tricentis Demo Web Shop']")).click();
			}
			else
			{
				System.out.println("Invalid Page");
			}
			}
			else
			{
				System.out.println("Page not found");
			}
			

				

		}


	}


