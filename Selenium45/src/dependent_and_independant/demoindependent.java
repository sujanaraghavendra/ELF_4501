package dependent_and_independant;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoindependent {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("gopalancoworks@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("gopi90");
		driver.findElement(By.xpath("//input[@value='Log in']")).submit();
        driver.findElement(By.partialLinkText("Books")).click();
        driver.findElement(By.partialLinkText("Computing and Internet")).click();
        driver.findElement(By.xpath("//input[contains(@data-productid,'13')]")).click();
        driver.findElement(By.partialLinkText("Health Book")).click();
        driver.findElement(By.xpath("//input[contains(@data-productid,'22')]")).click();
        driver.findElement(By.partialLinkText("Fiction")).click();
        driver.findElement(By.xpath("//input[contains(@data-productid,'45')]")).click();
        driver.findElement(By.partialLinkText("Shopping cart")).click();
        String price1 = driver.findElement(By.xpath("//a[contains(text(),'Computing and Internet')]/../../td[6]/span[2]")).getText();
        String price3 = driver.findElement(By.xpath("//a[contains(text(),'Fiction')]/../../td[6]/span[2]")).getText();
       String price2 = driver.findElement(By.xpath("//a[contains(text(),'Health Book')]/../../td[6]/span[2]")).getText();
      double p1 = Double.parseDouble(price1);
      double p2 = Double.parseDouble(price2);
      double p3 = Double.parseDouble(price3);
      double res=(p1<p2)?((p1<p3)?p1:p3):((p2<p3)?p2:p3);
      if(res==p1)
      {
    	  driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../td[1]/input")).click();
      }
      else if(res==p2)
      {
    	  driver.findElement(By.xpath("//a[text()='Fiction']/../../td[1]/input")).click();
      }
      else
      {
    	  driver.findElement(By.xpath("//a[text()='Health Book']/../../td[1]/input")).click();
      }
      driver.findElement(By.xpath("//input[@value='Update shopping cart']")).click();
     
	}

}
