package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		String given_data="https://demowebshop.tricentis.com/";
		String current_data=driver.getCurrentUrl();
		if(given_data.equals(current_data))
		{
			driver.findElement(By.partialLinkText("Digital downloads")).click();
			String cu_Title=driver.getTitle();
			String given_title="Demo Web Shop. Digital downloads";
			if(given_title.equals(cu_Title))
			{
				WebElement sort_by = driver.findElement(By.id("products-orderby"));
				Select s1 =new Select(sort_by);
			    List<WebElement> Options1 = s1.getOptions();
			    int i=0;
			    for (WebElement web1 : Options1) {
			    	sort_by = driver.findElement(By.id("products-orderby"));
			    	s1=new Select(sort_by);
			    	s1.selectByIndex(i++);	
					
				}
			    Thread.sleep(2000);
			    WebElement page_size = driver.findElement(By.id("products-pagesize"));
			    
			    Select s2=new Select(page_size);
			    List<WebElement> Options2 = s2.getOptions();
			    int j=0;
			    for (WebElement web2 : Options2) {
			    	page_size = driver.findElement(By.id("products-pagesize"));
			    	s2=new Select(page_size);
			    	s2.selectByIndex(j++);
			    						
				}
			    Thread.sleep(2000);
			    WebElement view = driver.findElement(By.id("products-viewmode"));
			    Select s3=new Select(view);
			    List<WebElement> Options3 = s3.getOptions();
			    int k=0;
			    for (WebElement web2 : Options3) {
			    	view = driver.findElement(By.id("products-viewmode"));
			    	s3=new Select(view);
			    	s3.selectByIndex(k++);	
					
				}
			    
			  }
			else
			{
				System.out.println("your are not in demo web app digital downloads..check url");
			}
		}
		else
		{
			System.out.println("your are not in demo web app ..check url");
		}
		
		driver.quit();


	}

}
