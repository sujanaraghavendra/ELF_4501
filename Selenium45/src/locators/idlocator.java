package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class idlocator {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		
		WebElement emailtext =driver.findElement(By.id("Email"));
		emailtext.sendKeys("sujanars2409@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.id("Password")).sendKeys("sujana123");
		Thread.sleep(2000);
		driver.findElement(By.id("RememberMe")).click();
		// TODO Auto-generated method stub

	}

}
