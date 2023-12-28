package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class take {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.olaelectric.com/");
		
		File capture=driver.findElement(By.xpath("//a[@aria-label='store logo']")).getScreenshotAs(OutputType.FILE);
		File destfile=new File("./screenshotsoferror/ola.png");
		FileHandler.copy(capture,destfile);
		// TODO Auto-generated method stub

	}

}
