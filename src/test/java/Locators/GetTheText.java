package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/fiction");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		Thread.sleep(2000);
		
		WebElement album = driver.findElement(By.xpath("//a[text()='3rd Album']/../../div[3]/div[1]/span"));
		Thread.sleep(2000);
		
		System.out.println(album.getText());
	}

}
