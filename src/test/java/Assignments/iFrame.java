package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	public static void main(String[] args) throws InterruptedException {
		//Open the browser
		WebDriver driver = new ChromeDriver();
								
		//Maximize the window
		driver.manage().window().maximize();
								
		//Set the implicit waiting comments
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
					
		//Navigate to  the Dream11 url
		driver.navigate().to("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
		driver.findElement(By.xpath("(//div[@class='form_container'])[2]")).click();
		
//		WebElement frame = driver.findElement(By.xpath("(//div[@class='form_container'])[2]"));
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
		
	}

}
