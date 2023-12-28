package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task17 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.partialLinkText("SIGN UP")).click();
		driver.findElement(By.id("usertype_yes")).click();
		boolean res = driver.findElement(By.id("usertype_yes")).isSelected();
		System.out.println(res);
		if(res==true)
		{
		
		boolean groupbox = driver.findElement(By.id("groupcode")).isDisplayed();
		System.out.println(groupbox);
		}
		else
		{
			driver.findElement(By.id("usertype_no")).click();
			boolean no = driver.findElement(By.id("usertype_no")).isDisplayed();
			System.out.println(no);
			
		}
//		
		
		// TODO Auto-generated method stub

	}

}
