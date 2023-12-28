package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multi {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multibox = driver.findElement(By.id("cars"));
		Select coursebyPriceSelect=new Select(multibox);
		
		coursebyPriceSelect.selectByIndex(2);
		Thread.sleep(1000);
		coursebyPriceSelect.selectByValue("399");
		Thread.sleep(4000);
		coursebyPriceSelect.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		Thread.sleep(2000);
		System.out.println(coursebyPriceSelect.getFirstSelectedOption().getText());
		
		coursebyPriceSelect.deselectByIndex(4);
		Thread.sleep(2000);
		coursebyPriceSelect.deselectByValue("99");
		Thread.sleep(1000);
		coursebyPriceSelect.deselectByVisibleText("INR 100 - INR 199 ( 16 )");
		
		// TODO Auto-generated method stub

	}

}
