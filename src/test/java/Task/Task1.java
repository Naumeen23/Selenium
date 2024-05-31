package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get ("https://demo.automationtesting.in/Register.html");
				
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Naumeen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Takildar");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Karve Nagar,Pune");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("naumeenst@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8055289544");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		driver.findElement(By.xpath("//a[text()='Hindi']")).click();
		driver.findElement(By.xpath("//a[text()='Japanese']")).click();
		
		WebElement web = driver.findElement(By.xpath("//select[@id='Skills']"));
		Select s = new Select(web);
		s.selectByValue("Java");
		
//	    WebElement country = driver.findElement(By.xpath("//span[@id='select2-country-container']"));
//		Select s2 = new Select(country);
//		s2.selectByValue("India");
		
//		act.keyDown(Keys.TAB).build().perform();
//		driver.findElement(By.xpath("//span[@id='select2-country-container']")).click();
//		driver.findElement(By.xpath("//span[text()='India']")).click();
		
		act.keyDown(Keys.TAB).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@id='yearbox']")).click();
		driver.findElement(By.xpath("//option[text()='2001']")).click();
		
		driver.findElement(By.xpath("//select[@placeholder='Month']")).click();
		driver.findElement(By.xpath("//option[text()='July']")).click();
		
		driver.findElement(By.xpath("//select[@id='daybox']")).click();
		driver.findElement(By.xpath("//option[text()='23']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("firstpassword")).sendKeys("Nomo@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("secondpassword")).sendKeys("Nomo@123");
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitbtn")).click();
		
	}

}
