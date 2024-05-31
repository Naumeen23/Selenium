package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Open empty brwser url
        WebDriver driver = new ChromeDriver();
		
        //Maximize the window
		driver.manage().window().maximize();
		
		//Launch the application
		driver.get("https://demowebshop.tricentis.com/fiction");
		
		driver.findElement(By.id("small-searchterms")).sendKeys("maharaj");
		
		

	}

}
