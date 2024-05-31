package CrossBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseClass
{
	
		public static WebDriver driver;
		
		public static void preCondition(String value)
		{
			if("chrome".equalsIgnoreCase(value)) {
				driver = new ChromeDriver();
			}
			else if("firefox".equalsIgnoreCase(value)) {
				driver = new FirefoxDriver();
			}
			else {
				driver = new EdgeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
		
		public static void dwsLogin()
		{
			driver.navigate().to("https://demowebshop.tricentis.com/login");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("Admin123@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("Admin@321");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
		}
		
		public static void postConditionClose()
		{
			System.out.println("My script is successfull !!");
			driver.close();
		}
		
		public static void postConditionQuit() 
		{
			System.out.println("My script is successfull !!");
			driver.quit();
		}
	}


