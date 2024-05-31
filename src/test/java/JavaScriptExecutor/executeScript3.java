package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeScript3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("naumeenst@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("Nomo@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement hidden_text = driver.findElement(By.name("custom_gender"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Moye Moye'", hidden_text);
	
	}

}
