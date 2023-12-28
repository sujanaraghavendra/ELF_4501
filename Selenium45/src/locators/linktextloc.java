package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class linktextloc {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.woodenstreet.com/home-decors?type=home");
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Dining & Kitchen")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.partialLinkText("Modular Kitchen")).click();
	}

}
