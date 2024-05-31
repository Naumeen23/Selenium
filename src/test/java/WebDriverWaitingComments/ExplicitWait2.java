package WebDriverWaitingComments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {
	public static void main(String[] args) {
		//Launch the empty browser
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
//		driver.navigate().to("http://omayo.blogspot.com/");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Dropdown']")));
//		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));
//		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
//		driver.navigate().back();
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
//		driver.findElement(By.id("timerButton")).click();
//		driver.switchTo().alert().accept();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
	
	}

}
