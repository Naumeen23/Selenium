package Task;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowTask {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("file:///C:/Users/Admin/Downloads/MultipleWindow.html");;
		
		String given_url = "file:///C:/Users/Admin/Downloads/MultipleWindow.html";
		String current_url = driver.getCurrentUrl();
		
		if(given_url.equals(current_url)) {
			driver.findElement(By.xpath("//input[@type='button']")).click();
			
			ArrayList<String> child_window1 = new ArrayList<>(driver.getWindowHandles());
			
			for(String str : child_window1) {
				if(!str.equals(child_window1)) {
					driver.switchTo().window(str);
					driver.manage().window().maximize();
				
				}
			}
			Thread.sleep(2000);
			
			ArrayList<String> child_window2 = new ArrayList<>(driver.getWindowHandles());
			for(String str2 : child_window2) {
				if(!str2.equals(child_window2)) {
					driver.switchTo().window(str2);
					driver.manage().window().maximize();
					
				}
			}
			
			Thread.sleep(2000);
			
			ArrayList<String> child_window3 = new ArrayList<>(driver.getWindowHandles());
			for(String str3 : child_window3) {
				if(!str3.equals(child_window3)) {
					driver.switchTo().window(str3);
					driver.manage().window().maximize();
					
				}
			}
			
			driver.close();
			
		}
		else {
			System.out.println("Page not found");
		}
		
	}

}
