package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class workwithenum {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaafashion.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).sendKeys("B","A","G","B","I","K","E",Keys.ENTER);
		
		// TODO Auto-generated method stub

	}

}
