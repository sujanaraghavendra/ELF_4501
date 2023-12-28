package JS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("http://www.facebook.com/signup");
		driver.findElement(By.xpath("//label[contains(text(),'Custom')]")).click();
		WebElement hidden = driver.findElement(By.name("custom_gender"));
		driver.executeScript("arguments[0].value='hi';", hidden);
	}

}
