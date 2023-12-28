package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class task13 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.partialLinkText("Register")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("gender-female")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("FirstName")).sendKeys("Sujana");
		Thread.sleep(1000);
		
		driver.findElement(By.name("LastName")).sendKeys("raghu");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Email")).sendKeys("sujanaraghus56e@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.id("Password")).sendKeys("Sujana@8");
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Sujana@8");
		Thread.sleep(1000);
		
		driver.findElement(By.name("register-button")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[value=\"Continue\"]")).click();
		//driver.get("https://demowebshop.tricentis.com/");
		
//		driver.findElement(By.partialLinkText("Log in")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.className("email")).sendKeys("sujanaraghusyu@gmail.com");
//		Thread.sleep(1000);
//		driver.findElement(By.className("password")).sendKeys("Sujana@89");
//		Thread.sleep(1000);
//		driver.findElement(By.id("RememberMe")).click();
//		driver.findElement(By.cssSelector("input[value=\"Log in\"]")).click();
//		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Book")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Computing and Internet")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("add-to-cart-button-13")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("removefromcart")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("updatecart")).click();
		
		//driver.findElement(By.className("button-2 product-box-add-to-cart-button")).click();
		
		
		
	}

}



