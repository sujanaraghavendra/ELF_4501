package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmation {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://licindia.in/");
		driver.findElement(By.xpath("//button[text()='Close']")).click();
		driver.findElement(By.partialLinkText("Pay Premium")).click();
		Alert alert = driver.switchTo().alert();
		String mess = alert.getText();
		System.out.println(mess);
		alert.accept();
		
	}

}
