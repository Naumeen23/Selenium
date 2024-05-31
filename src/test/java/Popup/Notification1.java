package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notification1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//Open empty browser
		WebDriver driver = new ChromeDriver();
						
		//Maximize the window
		driver.manage().window().maximize();
						
		//Click on redbus url
		driver.get("https://www.redbus.com/");
		Thread.sleep(2000);
		
		//Create robot class for handling the popup
		Robot r = new Robot();
		
		//Handling the popup
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		//For enter the popup use keypress
		r.keyPress(KeyEvent.VK_ENTER);
		//For release the popup use keyrelease
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}
