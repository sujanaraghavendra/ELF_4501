package TestNG;

import java.time.Duration;
import java.util.PriorityQueue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javafx.scene.layout.Priority;

public class Launch_browser 
{
	@Test
	public void tata()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.tatamotors.com/");
		}
	@Test(priority = 2)
	public void swift()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.arenaofecity.com/");
		
	}
	@Test(priority = 1)
	public void toyota()
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		driver.get("https://www.renault.co.in/");
		
	}

}
