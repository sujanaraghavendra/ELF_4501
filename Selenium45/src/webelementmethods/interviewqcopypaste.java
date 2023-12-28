package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class interviewqcopypaste {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		WebElement email = driver.findElement(By.id("Email"));
		email.sendKeys("sujana@gmail.com",Keys.CONTROL+"a");
		email.sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.id("Password")).sendKeys(Keys.CONTROL+"v");
		
		
		
		
	}

}
