package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fluent
{
	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(30));
	FluentWait fw=new FluentWait(driver).pollingEvery(Duration.ofMillis(100)).withTimeout(Duration.ofSeconds(15));
	
	
	driver.get("https://www.shoppersstack.com/");
	driver.findElement(By.id("loginBtn")).click();
	driver.findElement(By.id("Email")).sendKeys("testyantra123@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Test@123");
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.xpath("//img[contains(@alt,'Skinny Men Blue Jeans')]")).click();
	driver.findElement(By.id("Check Delivery")).sendKeys("432106");
	WebElement chexkbutton = driver.findElement(By.id("Check"));
	while(!(chexkbutton.isEnabled()))
	{}
   chexkbutton.click();
	
	
}

}
