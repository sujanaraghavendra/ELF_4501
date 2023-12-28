package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task15 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement usernametextbox = driver.findElement(By.id("username"));
		usernametextbox.clear();
		usernametextbox.sendKeys("sujana");
		Thread.sleep(1000);
		WebElement passwordtextbox = driver.findElement(By.id("password"));
		passwordtextbox.clear();
		passwordtextbox.sendKeys("suj123");
        Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
		
		String message = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(message);
		
		
	}

}
