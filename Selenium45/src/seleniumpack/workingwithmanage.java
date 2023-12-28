package seleniumpack;

import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithmanage {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chromedriver.driver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://skillrary.com/");
		
		driver.manage().window().fullscreen();
		// TODO Auto-generated method stub

	}

}
