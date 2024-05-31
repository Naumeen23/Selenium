package Task;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException{
		ChromeOptions option = new ChromeOptions();
		option.addArguments("-disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.id("dest")).sendKeys("Bengalore");
		Thread.sleep(2000);
		driver.findElement(By.id("onwardCal")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//text[@class='dateText']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search_button")).click();
		
		
		
		
	}
	
	
}
