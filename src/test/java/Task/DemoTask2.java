package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemoTask2 {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get ("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		
         List<WebElement> album = driver.findElements(By.xpath("//a[text()='3rd Album']"));
		for(WebElement web : album)
		{
			web.click();
			Thread.sleep(2000);
		}
		
			driver.findElement(By.xpath("//input[@value='1']")).sendKeys("3");
			Thread.sleep(2000);
			
			driver.findElement(By.id("add-to-cart-button-53")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.className("remove-from-cart")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.name("updatecart")).click();
		
		

}
}

