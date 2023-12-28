package web_table;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_and_Dynamic {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		
		for(int i=1;i<10;i++)
		{
			String day = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates ')]/../..//table//tr["+i+"]//td[1]")).getText();
			String cost = driver.findElement(By.xpath("//h2[contains(text(),'Historical Gold Rates ')]/../..//table//tr["+i+"]//td[2]")).getText();
			System.out.println(day+"-"+cost);
			
		}
	}

}
