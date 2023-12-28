package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class fileupload {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.ilovepdf.com/");
		Actions action=new Actions(driver);
		driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
		WebElement resume = driver.findElement(By.xpath("//input[@type='file']"));
		action.scrollToElement(resume).scrollByAmount(0, 100).perform();
		resume.sendKeys("C:\\Users\\Win11\\Downloads\\Sujana resume TY - Copy.docx");
		
		
	}

}
