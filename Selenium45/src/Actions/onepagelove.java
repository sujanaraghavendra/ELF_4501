package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class onepagelove {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://onepagelove.com/");
//		driver.findElement(By.xpath("//a[contains(@title,'Endless')]"));
		Actions action=new Actions(driver);
        for(;;)
        {
        	try
        	{
        		driver.findElement(By.xpath("//img[@alt='Endless Thumbnail Preview']")).click();
        		break;
        	}
        	catch(NoSuchElementException e)
        	{
        		action.scrollByAmount(0, 700).perform();
        	}
        }
	}

}
