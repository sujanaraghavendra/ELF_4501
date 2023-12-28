package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practiceonmove_x_y {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		WebElement passwordtextbox = driver.findElement(By.id("Password"));
		
		passwordtextbox.sendKeys("sujana");
		Thread.sleep(3000);
		Actions action=new Actions(driver);
		action.moveToElement(passwordtextbox, 240, 0).click().perform();
		
	}

}
