package IndependentDependentXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Album3rd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://demowebshop.tricentis.com/fiction");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//a[text()='Music 2'])[3]/../../div[3]/div/span"));
			
			

	}

}
