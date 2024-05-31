package WebDriverWaitingComments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	public static void main(String[] args) {
		//Launch the empty browser
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		System.out.println("Tata Bye Bye");
	}

}
