package seleniumpack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithmultiwindowid {

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
			Dimension windowofId=driver.manage().window().getSize();
			System.out.println(windowofId.getHeight());
			System.out.println(windowofId.getWidth());
			
			Dimension newSize=new Dimension(100,200);
			driver.manage().window().setSize(newSize);
			
			Point position=driver.manage().window().getPosition();
			System.out.println(position.getX());
			System.out.println(position.getY());
			
			Point newposition=new Point(100,200);
			driver.manage().window().setPosition(newposition);
				
		}
		

	}

}
