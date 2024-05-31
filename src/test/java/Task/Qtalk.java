package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Qtalk {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		Thread.sleep(2000);
	     driver.findElement(By.xpath("//section[text()='Frames']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//section[text()='iframes']")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//a[text()='Multiple iframe']")).click();
	     Thread.sleep(2000);
	     
	     WebElement frame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	     driver.switchTo().frame(frame);
	     driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	     Thread.sleep(2000);
	     driver.findElement(By.id("password")).sendKeys("Admin@1234");
	     Thread.sleep(2000);
	     driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
	     Thread.sleep(2000);
	     driver.findElement(By.id("submitButton")).click();
	     Thread.sleep(2000);
	     
	     driver.switchTo().defaultContent();
	     
	     Thread.sleep(2000);
	     
	    WebElement frame2 =  driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
	    driver.switchTo().frame(frame2);
	    driver.findElement(By.id("username")).sendKeys("Admin@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("Admin@1234");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    
	
	}

}
