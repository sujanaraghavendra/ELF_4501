package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class framebyindex {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]")).sendKeys("9975643478");
		// TODO Auto-generated method stub

	}

}
