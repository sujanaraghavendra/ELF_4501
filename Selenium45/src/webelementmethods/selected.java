package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class selected {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='1']")).click();
		boolean res = driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		System.out.println(res);
		

}
}
