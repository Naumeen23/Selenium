package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		String given_url = "https://demoapp.skillrary.com/";
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://skillrary.com/");
		Thread.sleep(2000);
		WebElement gear = driver.findElement(By.xpath("//span[text()='GEARS']"));
		Actions act = new Actions(driver);
		act.moveToElement(gear).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),' SkillRary Demo APP')]")).click();
		Thread.sleep(2000);
		
		String current_url = driver.getCurrentUrl();
		if(given_url.equals(current_url)) {
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement disable_button = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Hello'", disable_button);
		
		System.out.println("My script is successfull!!");
		}
		else {
			System.out.println("My script is unsuccessfull!!");
		}
		
		
	}

}
