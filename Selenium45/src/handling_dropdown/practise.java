package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}

}
