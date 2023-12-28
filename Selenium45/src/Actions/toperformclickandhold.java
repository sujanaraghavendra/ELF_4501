package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toperformclickandhold {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.paiinternational.in/");
		WebElement category = driver.findElement(By.partialLinkText("Select Category"));
		
		Actions action=new Actions(driver);
		action.moveToElement(category).perform();
		driver.findElement(By.id("furniture-2")).click();
		WebElement frombutton = driver.findElement(By.xpath("//span[contains(@class,'irs-slider from')]"));
		WebElement tobutton = driver.findElement(By.xpath("//span[contains(@class,'irs-slider to')]"));
		
		action.clickAndHold(frombutton).moveByOffset(20, 0).release().perform();
		action.moveToElement(tobutton).clickAndHold(tobutton).moveByOffset(-30, 0).release().perform();
		

	}

}
