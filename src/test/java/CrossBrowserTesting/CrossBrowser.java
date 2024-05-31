package CrossBrowserTesting;

public class CrossBrowser extends BaseClass{
	public static void main(String[] args) {
		
		BaseClass.preCondition("chrome");
		
		driver.get("https://www.ajio.com/");
	}

}
