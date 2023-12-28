package TestNG;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Threadpoolsize 
{
	@Test(priority = 3,invocationCount = 1,threadPoolSize = 2)
	public void tata()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatamotors.com/");
		driver.quit();
		}
	
	
	@Test(priority = 2,invocationCount = 4,threadPoolSize = 2)
	public void swift()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.arenaofecity.com/");
		driver.quit();
		
	}
	
	
	@Test(priority = 1,invocationCount = 0,threadPoolSize = 1)
	public void toyota()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.renault.co.in/");
		driver.quit();
		
	}



}
