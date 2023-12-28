package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalue {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		
		driver.get("https://skillrary.com/");
		driver.findElement(By.partialLinkText("SIGN IN")).click();
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		
	WebElement erroemessage = driver.findElement(By.id("email-error"));
	System.out.println(erroemessage.getCssValue("color"));
	}

}
