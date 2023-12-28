package Actions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contentto {

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
        
		Actions action=new Actions(driver);
		action.contextClick(textbox).perform();
		 WebElement open = driver.findElement(By.linkText("Open card"));
		 System.out.println(open.getText());
		 
		List<WebElement> a1 = driver.findElements(By.xpath("//div[contains(@data-testid,'quick-card-editor-buttons')]"));
		for(WebElement a2:a1)
		{
			System.out.println(a2.getText());
		}
		
	}

}
