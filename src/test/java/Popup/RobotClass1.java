package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass1 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		//Open empty browser
		WebDriver driver = new ChromeDriver();
						
		//Maximize the window
		driver.manage().window().maximize();
						
		//Click on demoautomation url
		driver.get("https://demowebshop.tricentis.com/"
				+ "");
		Thread.sleep(2000);
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_M);	
		r.keyPress(KeyEvent.VK_O);
		
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_O);
		
	
		
	}

}
