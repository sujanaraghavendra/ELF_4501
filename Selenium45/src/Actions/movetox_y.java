package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class movetox_y {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement password = driver.findElement(By.id("password"));
		
		
		password.sendKeys("Sujana@123");
		Thread.sleep(2000);
		System.out.println(password.getSize().getWidth());
		Actions action=new Actions(driver);
	action.moveToElement(password, 296, 0).click().perform();
		
		
	}

}
