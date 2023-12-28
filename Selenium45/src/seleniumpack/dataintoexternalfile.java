package seleniumpack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;

public class dataintoexternalfile {

	public static void main(String[] args) throws IOException 
	{
//		System.setProperty("webdriver.chrome.driver","./drivers.chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
		// TODO Auto-generated method stub

	
File file=new File("task2.html");
FileOutputStream fos=new FileOutputStream(file);
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
String titleofpage=driver.getTitle();
System.out.println(titleofpage);
String geturl=driver.getCurrentUrl();
System.out.println(geturl);
String sourcecode=driver.getPageSource();

//fos.write(titleofpage.getBytes());
//fos.write(geturl.getBytes());
fos.write(sourcecode.getBytes());

}
}