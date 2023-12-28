package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task14 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		Thread.sleep(1000);
		WebElement usernametextbox = driver.findElement(By.id("username"));
		usernametextbox.clear();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).clear();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("button[class='button buttonBlue']")).click();
		
		String message = driver.findElement(By.id("validationMessage")).getText();
		System.out.println(message);
	}

}
