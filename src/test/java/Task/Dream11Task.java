package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11Task {
	public static void main(String[] args) {
		//Open the browser
		WebDriver driver = new ChromeDriver();
				
		//Maximize the window
		driver.manage().window().maximize();
				
		//Set the implicit waiting comments
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
		//Navigate to  the Dream11 url
		driver.navigate().to("https://www.dream11.com/");
		
		//By using index iframe 
		driver.switchTo().frame(0);
		
		//Send the input to the textfield
		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("8055289544");
		
				
	}

}
