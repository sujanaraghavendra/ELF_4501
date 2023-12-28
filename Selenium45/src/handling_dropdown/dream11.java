package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class dream11 {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.dream11.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Enter Mobile Number')]")).sendKeys("sujana@gmail.com");
		
	}

}
