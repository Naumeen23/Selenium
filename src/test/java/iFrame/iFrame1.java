package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame1 {
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new ChromeDriver();
						
		//Maximize the window
		driver.manage().window().maximize();
						
		//Set the implicit waiting comments
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
		//Navigate to  the Dream11 url
		driver.navigate().to("https://www.dream11.com/");
		
		WebElement frame =driver.findElement(By.className("send-sms-iframe"));
				
		//By using index iframe 
//		driver.switchTo().frame(0);
//		driver.switchTo().frame("send-sms-iframe");
		driver.switchTo().frame(frame);
				
		//Send the input to the textfield
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8055289544");
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("hamburger")).click();	
	}

}
