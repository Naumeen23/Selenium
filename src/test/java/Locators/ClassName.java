package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		
		WebElement register = driver.findElement(By.className("ico-register"));
		register.click();
		
//		WebElement login = driver.findElement(By.className("ico-login"));
//		login.click();
//		
//		WebElement shoppingcart = driver.findElement(By.className("cart-label"));
//		shoppingcart.click();
//		
//		WebElement wishlist = driver.findElement(By.className("cart-label"));
//		wishlist.click();

	}

}
