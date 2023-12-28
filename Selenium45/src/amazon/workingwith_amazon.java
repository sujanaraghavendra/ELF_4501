package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwith_amazon {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//div[@id='nav-signin-tooltip']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8431570571");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Sujana@2409");
		// TODO Auto-generated method stub
        
	}

}
