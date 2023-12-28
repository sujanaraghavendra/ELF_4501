package DataProvider;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class url {
	@DataProvider
	public String[] urls() {
		 String[ ] arr= {"https://www.foodpanda.com/about-foodpanda/",
		 " https://www.zomato.com/login",
		 "https://www.swiggy.com/"};
		 return arr;
		 }
	
	@Test(dataProvider="urls")
	public void passurl(String data)
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(data);
	}

}
