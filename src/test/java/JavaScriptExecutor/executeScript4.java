package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class executeScript4 {
	public static void main(String[] args) throws InterruptedException {
		String given_signup = "https://login.oracle.com/mysso/signon.jsp";
		WebDriver driver = new ChromeDriver();														
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.oracle.com/in/java/technologies/downloads/");
		Thread.sleep(2000);
		WebElement jdk64 = driver.findElement(By.linkText("jdk-8u411-linux-x64.tar.gz"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)",jdk64);
		jdk64.click();
		WebElement disable_element = driver.findElement(By.linkText("Download jdk-8u411-linux-x64.tar.gz"));
		js.executeScript("arguments[0].click()", disable_element);
		
		String current_url = driver.getCurrentUrl();
		if(given_signup.endsWith(current_url)) {
			System.out.println("My script is successfull !!");
		}
		else {
			System.out.println("My script is unsuccessfull !!");
		}
	}

}
