package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabledinstagram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.instagram.com/sem/campaign/emailsignup/");
		Thread.sleep(10000);
		boolean res = driver.findElement(By.xpath("//button[text()='Sign Up']")).isEnabled();
		System.out.println(res);

	}

}
