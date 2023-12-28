package test_9_Dec;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class web {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("file:///C:/Users/Win11/Downloads/TestPage.html");
		driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
	    Set<String> allwindowId = driver.getWindowHandles();
		String parentid=driver.getWindowHandle();
		  
		
		for(String windowId: allwindowId)
		{
			driver.switchTo().window(windowId);
		 if((parentid.equals(windowId)))
		{
			 Thread.sleep(3000);
			driver.close();
			}
	}		
		

		

	}

}
