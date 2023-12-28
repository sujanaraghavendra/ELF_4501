package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task12 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm#");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(10000);
		
		
		
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();		
		Thread.sleep(2000);
		
		Set<String> allwindowId = driver.getWindowHandles();

		for(String windowId: allwindowId)
		{
			if(driver.switchTo().window(windowId).getCurrentUrl().contains("troubleloginhome"))
			{
				driver.findElement(By.id("nextstep")).click();
				break;
			}
			
			}
		driver.findElement(By.name("userName")).sendKeys("sujana");
		Thread.sleep(1000);
		
		driver.findElement(By.name("accountNo")).sendKeys("123456789012");
		Thread.sleep(1000);
		driver.findElement(By.id("mobileNo")).sendKeys("1234556897");
		
		driver.findElement(By.id("datepicker5")).sendKeys("10/02/2001");
		Thread.sleep(1000);
		
		driver.findElement(By.name("captchaValue")).sendKeys("11234");
		
		driver.findElement(By.name("Submit")).click();
		
		 




	}

}
