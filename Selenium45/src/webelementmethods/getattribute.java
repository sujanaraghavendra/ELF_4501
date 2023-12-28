package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
////		to capture tool tip
//		   driver.get("https://www.woodenstreet.com/");
//		   Thread.sleep(1000);
//		   String tooltipText = driver.findElement(By.cssSelector("img[title='Dining Table set']")).getAttribute("title");
//		   System.out.println(tooltipText);

////		   to capture alternative text
	   driver.get("https://www.woodenstreet.com/");
	   Thread.sleep(1000);
	  String alternativetxt = driver.findElement(By.cssSelector("img[alt='Wooden Sofa Come Bed Furniture']")).getAttribute("alt");
	   System.out.println(alternativetxt);
			
			
//			to capture data entered
           	driver.get("https://www.nykaafashion.com/");
           	Thread.sleep(1000);
           	WebElement textbox = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
           	textbox.clear();
           	textbox.sendKeys("ajshjsbm");
           	String valueentered = textbox.getAttribute("value");
           	System.out.println(valueentered);
		   
	}

}
