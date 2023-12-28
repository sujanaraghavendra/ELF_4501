package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroll {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//span[contains(text(),'Got it')]")).click();
		Actions action =new Actions(driver);
		action.scrollByAmount(0, 3000);
		driver.findElement(By.xpath("//span[contains(text(),'Resume writing')]")).click();
	}

}
