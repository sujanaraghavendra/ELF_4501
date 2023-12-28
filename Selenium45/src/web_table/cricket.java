package web_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricket {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
		driver.get("https://www.espncricinfo.com/series/australia-in-india-2023-24-1389381/india-vs-australia-5th-t20i-1389395/full-scorecard");
//		driver.findElement(By.xpath(""));
		
		
	}

}
