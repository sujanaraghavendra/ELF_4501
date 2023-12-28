package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class speedtest {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://www.speedtest.net/");
        Thread.sleep(1000);
        WebElement frame = driver.findElement(By.id("google_ads_iframe_/6692/speedtest.net/stnext_lowerboard_0"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("cbb")).click();
        driver.switchTo().defaultContent();
        

	}

}
