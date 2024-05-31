package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1 {

	public static void main(String[] args) throws InterruptedException {
		
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
				driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				Thread.sleep(2000);
				
				List<WebElement>addCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
				for(WebElement web : addCart)
				{
					web.click();
				}
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
				
				List<WebElement>removeCart = driver.findElements(By.className("remove-from-cart"));
				for(WebElement web : removeCart) {
					web.click();
				}
				
				driver.findElement(By.name("updatecart")).click();
		
			}
			else
			{
				System.out.println("Invalid page");
			}
		
		}
		else
		{
			System.out.println("Page not found");
		}
		
		

	}

}
