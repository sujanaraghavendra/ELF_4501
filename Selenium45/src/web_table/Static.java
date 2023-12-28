package web_table;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static {

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://groww.in/gold-rates/gold-rate-today-in-bangalore");
		for (int i = 1; i < 5; i++) {
			String details = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr[" + i + "]/td[1]"))
					.getText();
			String cost = driver.findElement(By.xpath("//h2[contains(text(),'22K & 24K Gold')]/../..//table/tbody/tr[" + i + "]/td[2]/div/div[1]"))
					.getText();
			System.out.println(details + " - " + cost);
		}
		
		
	}

}
