package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeScript2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.dream11.com/");
		WebElement scroll = driver.findElement(By.xpath("//div[contains(text(),'Reviews &')]"));
//		scroll.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);",scroll);
		js.executeScript("arguments[0].scrollIntoView(false);",scroll);
	}

}
