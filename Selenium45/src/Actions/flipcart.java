package Actions;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipcart {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

}
