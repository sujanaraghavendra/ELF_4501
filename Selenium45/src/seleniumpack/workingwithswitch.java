package seleniumpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithswitch {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("driver.chromedriver.driver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win11/Downloads/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);
		
		for(String windowID : allwindowId)
		{
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			
		}
		// TODO Auto-generated method stub

	}

}
