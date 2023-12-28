package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class classname {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Log in")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("email")).sendKeys("sujana23@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.className("password")).sendKeys("Sujana@123");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click()
;		// TODO Auto-generated method stub

	}

}
