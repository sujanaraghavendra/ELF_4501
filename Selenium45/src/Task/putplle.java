package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class putplle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.purplle.com/");
		Thread.sleep(2000);
//		driver.findElement(By.partialLinkText("SHOP CATEGORIES")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[contains(@data-evlbl,'Skin Care')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//img[contains(@alt,'Vaseline Deep Moisture Silky Body Creme, 180 g')]")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.id("grp-text-115842")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//a[contains(@class,'mat-focus-indicator addbtn btn-add-cart fwb mat-button mat-button-base ng-star-inserted')]")).click();
	    driver.findElement(By.partialLinkText("SHOP CATEGORIES")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(@class,'mg-sbm-li-a gatrk fanB')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[contains(@alt,'NY Bae Banana Loose Powder (5.8 g)')]")).click();
	    
	}

}
