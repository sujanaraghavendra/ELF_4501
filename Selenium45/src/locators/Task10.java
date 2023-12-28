package locators;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.maybelline.co.in/");
		String parentId=driver.getWindowHandle();
		Thread.sleep(5000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.nykaafashion.com/");
		
		driver.findElement(By.linkText("Men")).click();
		Thread.sleep(5000);
		
		
		Set<String> allwindowId = driver.getWindowHandles();
		
		
		for(String windowId: allwindowId)
		{
			if(driver.switchTo().window(windowId).getTitle().contains("Men"))
			{
				driver.findElement(By.linkText("Careers")).click();
				break;
			}
		}
			driver.switchTo().window(parentId).close();
		}
		

	}


