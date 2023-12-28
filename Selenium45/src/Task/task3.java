package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("driver.chromedriver.driver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Win11/Downloads/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(2000);
		Set<String> allwindowId = driver.getWindowHandles();
		  
		
		for(String windowId: allwindowId)
		{
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().contains("campco"))
			{
				driver.close();
				break;
			}
		}
		// TODO Auto-generated method stub

	}



}
