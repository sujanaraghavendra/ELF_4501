package dependent_and_independant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dependent_independant {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.purplle.com/");
//		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("SHOP CATEGORIES")).click();
//		Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@data-evlbl,'Skin Care')]")).click();
//        Thread.sleep(5000);
	    driver.findElement(By.xpath("//div[contains(text(),'Vaseline Deep Moisture Serum In Lotion')]")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.id("addToCart")).click();

	}

}
