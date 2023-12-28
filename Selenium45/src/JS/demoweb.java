package JS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoweb {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement disable = driver.findElement(By.xpath("//input[(@class='form-control')]"));
		driver.executeScript("arguments[0].value='hi';", disable); 

	}

}
