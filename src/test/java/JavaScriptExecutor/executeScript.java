package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class executeScript {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.dream11.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,999)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(0,-999)");
//		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,999)");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-999)");
//		
		
	}

}
