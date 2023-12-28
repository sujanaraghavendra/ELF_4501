package test_9_Dec;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sbi_task_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(" https://retail.onlinesbi.sbi/retail/login.htm");
	
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();	
		Set<String> allwindowId = driver.getWindowHandles();
		
		for(String windowId: allwindowId)
		{
			if(driver.switchTo().window(windowId).getCurrentUrl().contains("troubleloginhome"))
			{
				Dimension size = driver.manage().window().getSize();
				System.out.println(size);
				Dimension ns=new Dimension(900,700);
				driver.manage().window().setSize(ns);
				
				driver.findElement(By.id("nextstep")).click();
				break;
			}
			
			}
			
        driver.findElement(By.id("userName")).sendKeys("234");
		driver.findElement(By.id("go")).click();         
		String alertmain = driver.switchTo().alert().getText();
		System.out.println(alertmain);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("userName")).clear();
		driver.findElement(By.id("userName")).sendKeys("sujana");
		
		driver.findElement(By.id("accountNo")).sendKeys("123");
		driver.findElement(By.id("go")).click();
		String alert1 = driver.switchTo().alert().getText();
		System.out.println(alert1);
        driver.switchTo().alert().accept();
        driver.findElement(By.id("accountNo")).clear();
		driver.findElement(By.id("accountNo")).sendKeys("76738716278");
		driver.findElement(By.id("go")).click();
		String alertmain2 = driver.switchTo().alert().getText();
		System.out.println(alertmain2);
        driver.switchTo().alert().accept();
	
		WebElement country = driver.findElement(By.name("countryCode"));
        Select countyname=new Select(country);
        countyname.selectByValue("91");
        driver.findElement(By.id("go")).click();
        String alertmess = driver.switchTo().alert().getText();
        System.out.println(alertmess);
        driver.switchTo().alert().accept();
      
		driver.findElement(By.id("mobileNo")).sendKeys("ajkshj");
		driver.findElement(By.id("go")).click();
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2);
	    driver.switchTo().alert().accept();
		driver.findElement(By.id("mobileNo")).sendKeys("8431570571");
		
		 WebElement day = driver.findElement(By.id("datepicker5"));
		 day.sendKeys("32/12/2023");
		driver.findElement(By.id("go")).click();
		String alert3=driver.switchTo().alert().getText();
		System.out.println(alert3);
		driver.switchTo().alert().accept();
		day.clear();
		driver.findElement(By.id("datepicker5")).sendKeys("30/12/2023");
	
		WebElement month = driver.findElement(By.id("datepicker5"));
		month.sendKeys("30/13/2023");
		driver.findElement(By.id("go")).click();
		String alert4=driver.switchTo().alert().getText();
		System.out.println(alert4);
		driver.switchTo().alert().accept();
		month.clear();
		driver.findElement(By.id("datepicker5")).sendKeys("30/12/2023");
	
		WebElement year = driver.findElement(By.id("datepicker5"));
		year.sendKeys("30/12/2035");
		driver.findElement(By.id("go")).click();
		String alert5=driver.switchTo().alert().getText();
		System.out.println(alert5);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("datepicker5")).sendKeys("30/12/2030");
		
		driver.findElement(By.id("go")).click();
				
		
	}

}
