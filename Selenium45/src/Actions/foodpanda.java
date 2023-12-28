package Actions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class foodpanda {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.foodpanda.com/");
		Actions action=new Actions(driver);
		
		List<WebElement> allele = driver.findElements(By.xpath("//ul[@id=\"menu-primary\"]/li[not (contains(.,'Choose location'))]"));
		for(WebElement ele:allele)
		{
			action.keyDown(Keys.SHIFT).perform();
			ele.click();
			action.keyUp(Keys.SHIFT).perform();
		}
//		String windowtitle="panda ads";
		Set<String> allwindow = driver.getWindowHandles();
		for(String windowId:allwindow)
		{
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("panda ads"))
			{
				driver.close();
				break;
			}
		
			
		}
		
		
	}

}
