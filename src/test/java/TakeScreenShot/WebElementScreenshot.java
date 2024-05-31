package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {
	public static void main(String[] args) throws IOException {
		//Open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Set the implicit waiting comments
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Open the redbus url
		driver.navigate().to("https://www.redbus.in/");
		
		//Find the WebElement and store it
		WebElement allu = driver.findElement(By.id("homeV2-root"));
		
		//Take the ScreenShot of WebElement using getScreenshotAs() method
		File from = allu.getScreenshotAs(OutputType.FILE);
		
		//Store the screenshot into the file location
		File to = new File("./ScreenShot/Allu.png");
		
		//Copy the file to the location
		FileHandler.copy(from, to);
	}

}
