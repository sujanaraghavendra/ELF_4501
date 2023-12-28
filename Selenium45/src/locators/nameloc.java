package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nameloc {

	public static void main(String[] args) throws InterruptedException 
	{
		
			System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.skillrary.com/user/login");
			
			driver.findElement(By.name("email")).sendKeys("sujanars2409@gmail.com");
			Thread.sleep(2000);
 
			driver.findElement(By.name("password")).sendKeys("Sujana@123");
			Thread.sleep(2000);
			
			driver.findElement(By.name("captcha")).sendKeys("dsfgajd");
			Thread.sleep(2000);
			
			



	}

}
