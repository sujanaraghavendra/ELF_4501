package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.glass.events.KeyEvent;

public class handlerobottoauthentication {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
		ChromeOptions settings=new ChromeOptions();
		settings.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(settings);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_J);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyPress(KeyEvent.VK_U);
		robot.keyPress(KeyEvent.VK_J);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_J);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		

		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_J);
		
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
