package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task18rediff {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebDriverWait explicitWait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123");
		driver.findElement(By.name("proceed")).submit();
		driver.findElement(By.partialLinkText("Write mail")).click();
		driver.findElement(By.id("TO_IDcmp2")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'rd_inp_sub rd_subject_datacmp2')]")).sendKeys("Sujana");
		 WebElement text = driver.findElement(By.xpath("//iframe[contains(@class,'cke_wysiwyg_frame cke_reset')]"));
		 driver.switchTo().frame(text);
		 driver.findElement(By.xpath("//body[contains(@class,'cke_editable cke_editable_themed cke_contents_ltr cke_show_borders')]")).sendKeys("Hi goodmorning");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.partialLinkText("Send")).click();
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Your mail has been sent']")));
		 File capture = driver.getScreenshotAs(OutputType.FILE);
			File destFile=new File("./screenshotsoferror/send.png");
			FileHandler.copy(capture, destFile);
			driver.navigate().refresh();
	    driver.findElement(By.xpath("//a[@class='mr_icon2 rd_mail_trash masterTooltip']/../../../..//li[@subject='Sujana']")).click();
	    driver.findElement(By.xpath("//li[@title='Delete mail']")).click();
    explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[text()='1 mail deleted successfully']")));
	    File capture1 = driver.getScreenshotAs(OutputType.FILE);
		File destFile1=new File("./screenshotsoferror/delete.png");
		FileHandler.copy(capture1, destFile1);
		 
	}
	

}
