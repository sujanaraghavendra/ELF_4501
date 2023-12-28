package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task11 

{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
//		driver.findElement(By.partialLinkText("SPANISH")).click();
//		driver.findElement(By.partialLinkText("ENGLISH")).click();
//		
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		
		driver.findElement(By.id("email")).sendKeys("sujanars2409@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("password")).sendKeys("Sujana@123");
		Thread.sleep(5000);
		driver.findElement(By.id("usertype_yes")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("groupcode")).sendKeys("TYSS123");
		Thread.sleep(1000);
		driver.findElement(By.name("remember")).click();
		
		

	}

}


