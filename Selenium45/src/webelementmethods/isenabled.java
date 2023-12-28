package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	boolean res = driver.findElement(By.name("login")).isEnabled();
    boolean emailtextbox = driver.findElement(By.id("email")).isDisplayed();
	System.out.println(res);
	System.out.println(emailtextbox);
}
}