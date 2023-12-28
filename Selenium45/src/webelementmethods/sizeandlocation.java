package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sizeandlocation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		WebElement emailtextbox = driver.findElement(By.id("email"));
		WebElement passwordTextbox = driver.findElement(By.id("passContainer"));
		
		Point emailbox = emailtextbox.getLocation();
		Point passwordbox = passwordTextbox.getLocation();
		System.out.println("X value"+emailbox.getX());
		System.out.println("X value"+passwordbox.getX());
		
		if(emailbox.getX()==passwordbox.getX())
		{
			System.out.println("alligned properly");
		}
		else
		{
			System.out.println("not alligned properly");
		}
		
		Dimension email = emailtextbox.getSize();
		Dimension pass = passwordTextbox.getSize();
		System.out.println(email.getWidth());
		System.out.println(pass.getWidth());
		System.out.println(emailbox.getX()+email.getWidth());
		System.out.println(passwordbox.getX()+pass.getWidth());

	}

}
