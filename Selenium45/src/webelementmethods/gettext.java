package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement emailtextbox = driver.findElement(By.id("Email"));
		emailtextbox.clear();
		emailtextbox.sendKeys("ahajsjks");
		Thread.sleep(2000);
		WebElement passwordtextbox = driver.findElement(By.id("Password"));
		passwordtextbox.clear();
		passwordtextbox.sendKeys("Raghu@123");
		String errormessage = driver.findElement(By.cssSelector("span[data-valmsg-for='Email']")).getText();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).submit();
		Thread.sleep(2000);
		 System.out.println(errormessage);
	}

}
