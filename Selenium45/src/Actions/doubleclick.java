package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		
		
		WebElement plusbutton = driver.findElement(By.id("add"));
		Actions action=new Actions(driver);
		action.doubleClick(plusbutton).perform();
		action.doubleClick(plusbutton).perform();
		Thread.sleep(1000);
		WebElement minusbutton = driver.findElement(By.id("minus"));
		action.doubleClick(minusbutton).perform();
		// TODO Auto-generated method stub

	}

}
