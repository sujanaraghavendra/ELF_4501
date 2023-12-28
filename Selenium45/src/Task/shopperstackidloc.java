package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopperstackidloc {

	public static void main(String[] args) throws InterruptedException 
	{
			System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.shoppersstack.com/");
			Thread.sleep(10000);
			driver.findElement(By.id("loginBtn")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("Create Account")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("First Name")).sendKeys("Sujana");
			Thread.sleep(1000);
			
			driver.findElement(By.id("Last Name")).sendKeys("Raghu");
			Thread.sleep(1000);
			
			driver.findElement(By.id("Female")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("Phone Number")).sendKeys("8431570571");
			Thread.sleep(1000);
			
			driver.findElement(By.id("Email Address")).sendKeys("sujanars2409@gmail.com");
			Thread.sleep(1000);
			
			driver.findElement(By.id("Password")).sendKeys("Sujana@123");
			Thread.sleep(1000);
			
			driver.findElement(By.id("Confirm Password")).sendKeys("Sujana@123");
			Thread.sleep(1000);
			
			driver.findElement(By.id("Terms and Conditions")).click();
			Thread.sleep(1000);
			
			driver.findElement(By.id("btnDisabled")).click();
			Thread.sleep(1000);
			
			
			
		// TODO Auto-generated method stub

	}

}
