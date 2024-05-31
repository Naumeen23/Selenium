package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
	public static void main(String[] args) throws InterruptedException {
		//Open empty browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Click on demoautomation url
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//Click on the alert with ok & cancel tab
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
		
		//Click on display confirmation button
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box ')]")).click();
		Thread.sleep(2000);
		
		//Handle the popup window
		Alert alert = driver.switchTo().alert();
		alert.accept();
//		driver.switchTo().alert().dismiss();
		
	}

}
