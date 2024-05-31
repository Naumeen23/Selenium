package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("-disable-notifications");
		
		//Launch the empty browser
		WebDriver driver = new ChromeDriver(options);
																		
		//To maximize the window
		driver.manage().window().maximize();
																		
		//Enter into redbus app
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		
		//click on the date textfield
		driver.findElement(By.id("onwardCal")).click();
		Thread.sleep(2000);
		
		//select the date from calender
		driver.findElement(By.xpath("//span[@class='DayTiles_CalenderDaysSpan-sc-lxum02u-1")).click();
		Thread.sleep(2000);
		
		
	}

}
