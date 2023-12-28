package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcssvalueonshopperstack {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(15000);
		
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("testyantra123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//span[@class='MuiButton-label']")).click();
        WebElement colorofshop = driver.findElement(By.partialLinkText("shop products"));
        System.out.println(colorofshop.getCssValue("font-weight"));
	}

}
