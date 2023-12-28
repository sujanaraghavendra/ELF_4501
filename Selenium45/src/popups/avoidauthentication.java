package popups;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class avoidauthentication {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://admi:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
