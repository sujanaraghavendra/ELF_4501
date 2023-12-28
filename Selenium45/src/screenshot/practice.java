package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class practice {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.swiggy.com/");
		File source=driver.findElement(By.xpath("//div[contains(@class,'_2h2bu')]")).getScreenshotAs(OutputType.FILE);
		File destfile=new File("./screenshotsoferror/swiggy.png");
		FileHandler.copy(source,destfile);
		// TODO Auto-generated method stub

	}

}
