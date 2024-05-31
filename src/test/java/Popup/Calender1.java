package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender1 {
	public static void main(String[] args) throws InterruptedException {
		//Launch the empty browser
		WebDriver driver = new ChromeDriver();
																
		//To maximize the window
		driver.manage().window().maximize();
																
		//Enter into agoda app
		driver.get("https://www.agoda.com/");
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@data-selenium='icon-box-child']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-05-30']")).click();
		Thread.sleep(2000);
		
		for( ; ; )
		{
			try
			{
				driver.findElement(By.xpath("//span[@data-selenium-date='2024-10-02']")).click();
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
		
		
		
						
	}

}
