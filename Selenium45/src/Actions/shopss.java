package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopss {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.reliancedigital.in/");
		driver.findElement(By.id("wzrk-cancel")).click();
		Thread.sleep(1000);
		
		WebElement computers = driver.findElement(By.xpath("//div[contains(text(),'Computers')]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(computers).perform();
	}

}
