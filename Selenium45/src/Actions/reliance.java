package Actions;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class reliance {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(1000);
		WebElement men = driver.findElement(By.id("men"));
		
		Actions actions=new Actions(driver);
		actions.moveToElement(men).perform();
	    Thread.sleep(2000);
	    WebElement shirts = driver.findElement(By.linkText("T-SHIRTS"));
	     
	    Actions actions1=new Actions(driver);
	    actions.moveToElement(shirts).perform();
		
	}

}
