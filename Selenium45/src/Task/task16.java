package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task16 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(1000);
		
		WebElement emailtextbox = driver.findElement(By.id("Email"));
		emailtextbox.clear();
		emailtextbox.sendKeys("gowthamitester@gmail.com");
		Thread.sleep(2000);
		WebElement passwordtextbox = driver.findElement(By.id("Password"));
		passwordtextbox.clear();
		passwordtextbox.sendKeys("Raghu@123");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value='Log in']")).submit();
		Thread.sleep(10000);
		String message = driver.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		System.out.println(message);
		
		
	}

}
