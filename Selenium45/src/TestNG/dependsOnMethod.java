package TestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependsOnMethod 
{
	@Test(priority = 1)
	public void zomato()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.zomato.com/login");
		driver.quit();
		}
	
	
	@Test(priority = 2,dependsOnMethods ="zomato")
	public void swiggy()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.swiggy.com/");
		driver.quit();
		
	}
	
	
	@Test(priority = 3,dependsOnMethods ="swiggy")
	public void foodpanda()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.foodpanda.com/");
		driver.quit();
		
	}
	
	@Test(priority = 4,dependsOnMethods="foodpanda")
	public void blinkit()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://blinkit.com/"); 
		driver.quit();
	}


}
