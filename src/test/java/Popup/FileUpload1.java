package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		WebElement input_file = driver.findElement(By.xpath("//input[@type='file']"));
		input_file.sendKeys("D:\\NewSelenium\\FileUpload.docx");
	}

}
