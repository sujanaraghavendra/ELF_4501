package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyup_and_keydown {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://parivahan.gov.in/parivahan/");
		Actions action=new Actions(driver);
		List<WebElement> allnavelement = driver.findElements(By.xpath("//li[@data-level='1']"));
		
		for(WebElement ele:allnavelement)
		{
			action.keyDown(Keys.CONTROL).perform();
			ele.click();
			action.keyUp(Keys.CONTROL).perform();
		}
//		 driver.findElement(By.partialLinkText("About Us"));
		String name = driver.switchTo().newWindow(WindowType.WINDOW).getTitle();

		
		

	}

}
