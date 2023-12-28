package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myworkingongetposition 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(1000);
		
		WebElement emailfield = driver.findElement(By.name("emailId"));
		WebElement passwordfield = driver.findElement(By.name("password"));
		
		Point email = emailfield.getLocation();
		Point pass = passwordfield.getLocation();
		System.out.println(email.getX());
		System.out.println(pass.getX());
		System.out.println(email.getY());
		System.out.println(pass.getY());
		
		Dimension emailbox = emailfield.getSize();
		Dimension passbox = passwordfield.getSize();
		System.out.println(emailbox.getWidth());
		System.out.println(passbox.getWidth());
		System.out.println(emailbox.getHeight());
		System.out.println(passbox.getHeight());
		
		

}
}

