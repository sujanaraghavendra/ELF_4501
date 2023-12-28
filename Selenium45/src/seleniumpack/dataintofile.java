package seleniumpack;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

public class dataintofile {

	public static void main(String[] args) throws IOException 
	{
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
		File file=new File("task1.txt");
		if(!file.exists())
		{
			System.out.println("file is created");
			file.createNewFile();
		}
			else
			{
				System.out.println("file already created");
			}
		FileOutputStream fos=new FileOutputStream(file);
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String titleofpage=driver.getTitle();
		System.out.println(titleofpage);
		String geturl=driver.getCurrentUrl();
		System.out.println(geturl);
		fos.write(titleofpage.getBytes());
		fos.write(geturl.getBytes());
		
		}
		
	}


