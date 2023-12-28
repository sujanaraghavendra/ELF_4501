package seleniumpack;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserhistorynavigation {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.get("https://www.icicibank.com/");
		Thread.sleep(2000);
		driver.get("https://bankofindia.co.in/");
		
		
		Thread.sleep(2000);
		Navigation navigation=driver.navigate();
		navigation.back();
		Thread.sleep(2000);
		navigation.forward();
		Thread.sleep(2000);
		navigation.refresh();
		
		// TODO Auto-generated method stub

	}

}
