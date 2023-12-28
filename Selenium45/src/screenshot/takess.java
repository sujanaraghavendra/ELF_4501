package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takess {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.asianpaints.com/");
		File capture = driver.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./screenshotsoferror/asian.jpeg");
		FileHandler.copy(capture, destFile);
		
	}

}
