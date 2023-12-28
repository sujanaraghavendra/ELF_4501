package seleniumpack;


import org.openqa.selenium.Dimension;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithdimenstion {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver.driver", "./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.nestle.in/");
		Dimension size= driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		Thread.sleep(2000);
		
		Dimension newSize=new Dimension(500,500);
		driver.manage().window().setSize(newSize);
		
		// TODO Auto-generated method stub

	}

}
