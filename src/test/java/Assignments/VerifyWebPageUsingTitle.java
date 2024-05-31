  package Assignments;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class VerifyWebPageUsingTitle {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("https://demowebshop.tricentis.com/");
			String given_title="Demo Web Shop";
			String Cu_title = driver.getTitle();
			
			if(given_title.equals(Cu_title))
			{
				System.out.println("Your are in demowebshop");
				Thread.sleep(2000);
				driver.navigate().back();
				Thread.sleep(2000);
				driver.navigate().forward();
				Thread.sleep(2000);
				driver.navigate().refresh();
			}
			else
			{
				System.out.println("You are not in demowebshop");
			}
			

		}

	}


