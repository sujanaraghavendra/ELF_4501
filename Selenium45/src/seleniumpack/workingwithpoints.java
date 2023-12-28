package seleniumpack;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class workingwithpoints {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver.driver","./drivers.chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.booking.com/");
		Point position=driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());
		
		Point newposition= new Point(100,200);
		driver.manage().window().setPosition(newposition);
		// TODO Auto-generated method stubaw3

	}

}
