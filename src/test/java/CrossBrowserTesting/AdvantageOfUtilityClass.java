package CrossBrowserTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvantageOfUtilityClass extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.preCondition("chrome");
		dwsLogin();
		
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement>cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web : cart) {
			web.click();
			Thread.sleep(2000);
		}
		
		Thread.sleep(2000);
		postConditionClose();
	}

}
