package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implict {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("testyantra123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//img[contains(@alt,'Skinny Men Blue Jeans')]")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("432106");
		WebElement chexkbutton = driver.findElement(By.id("Check"));
		while(!(chexkbutton.isEnabled()))
		{}
			chexkbutton.click();
		
		// TODO Auto-generated method stub

	}

}
