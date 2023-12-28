package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddropby {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://id.atlassian.com/login");
		driver.findElement(By.id("username")).sendKeys("sujanars2409@gmail.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.id("password")).sendKeys("Sujanaraghu@2409");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("(//div[text()='Trello'])[1]")).click();
		driver.findElement(By.linkText("manual")).click();
		
		
		WebElement textbox = driver.findElement(By.partialLinkText("completed"));
		WebElement traget = driver.findElement(By.xpath("//h2[text()='selenium']/../../..//button[text()='Add a card']"));
        
		Actions action=new Actions(driver);
		action.dragAndDrop(textbox, traget).perform();

	}

}
