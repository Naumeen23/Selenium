package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTask1 {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get ("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.className("ico-register")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		Thread.sleep(2000);
				
	}

}
