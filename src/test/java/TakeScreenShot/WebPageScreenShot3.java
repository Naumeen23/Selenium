package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenShot3 {
	public static void main(String[] args) throws IOException {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("before change======>"+date);
		String change_date = date.toString().replace(":", "-");
		System.out.println("after change=====>"+change_date);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		WebDriver driver = new ChromeDriver();														
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://twitter.com/ShraddhaKapoor");
		TakesScreenshot ts =(TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File(".\\ScreenShot\\twitter"+change_date+".png");
		FileHandler.copy(from, to);
		}


}
