package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scrollbyelement {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.foodpanda.com/");
		Actions action=new Actions(driver);
		 WebElement food=driver.findElement(By.xpath("//li[contains(text(),'Copyright © 2023' )]/..//a[text()='foodpanda']"));
		
		action.scrollToElement(food).perform();
		
		
	}

}
