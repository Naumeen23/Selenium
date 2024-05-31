package iFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame2 {
	public static void main(String[] args) {
	    //Open the browser
		WebDriver driver = new ChromeDriver();
								
		//Maximize the window
		driver.manage().window().maximize();
								
		//Set the implicit waiting comments
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					
		//Navigate to  the Dream11 url
		driver.navigate().to("file:///C:/Users/Admin/Downloads/iframe-1.html");
		
		WebElement frame = driver.findElement(By.id("FR1"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("small-searchterms")).sendKeys("Selenium007");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Google']")).click();
	}

}
