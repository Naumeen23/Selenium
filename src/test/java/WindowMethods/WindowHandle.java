package WindowMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(2000);
		
		String parent_handle = driver.getWindowHandle();
		System.out.println("DWS page =======>"+parent_handle);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		
		Set<String>childs = driver.getWindowHandles();
		System.out.println(childs);
		
	}

}
