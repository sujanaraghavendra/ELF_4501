package seleniumpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class workingwithbrowseractions {

	public static void main(String[] args)
	{
		//launch chrome
//		ChromeDriver d=new ChromeDriver();
//		d.get("https://www.google.com");
		 
		//Launch firefox
//		FirefoxDriver f=new FirefoxDriver();
//		f.get("https://www.google.com");
		
		//upcasting  
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com");
		 
		
		// TODO Auto-generated method stub

	}

}
