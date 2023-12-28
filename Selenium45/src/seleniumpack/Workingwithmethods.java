package seleniumpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Workingwithmethods {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/3");
		 String titleOfThePage = driver.getTitle();
		String sourcecode = driver.getPageSource();
		String id=driver.getWindowHandle();
		System.out.println(id);
		System.out.println(titleOfThePage);
		System.out.println(sourcecode);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@id='compare']")).click();
		Thread.sleep(10000);
		//driver.close();
		driver.quit();
		
		
		

	}

}
