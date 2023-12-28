package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class scrollorigin {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Got it')]")).click();
		Actions action =new Actions(driver);
		
		WebElement resume = driver.findElement(By.xpath("//span[contains(text(),'Resume writing')]"));
		action.scrollFromOrigin(ScrollOrigin.fromElement(resume), 0, 200).perform();
//		resume.click();
		
		
		
	
	}

}
