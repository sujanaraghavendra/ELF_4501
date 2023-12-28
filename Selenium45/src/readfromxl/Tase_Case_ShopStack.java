package readfromxl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tase_Case_ShopStack {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		WebElement email = driver.findElement(By.id("Email"));
	
		File abspath=new File("./resources/TC_for_Login.xlsx");
		FileInputStream fis=new FileInputStream(abspath);
		
		Workbook work=WorkbookFactory.create(fis);
		
		String data1 = work.getSheet("Sheet1").getRow(14).getCell(6).getStringCellValue();
		String data2 = work.getSheet("Sheet1").getRow(15).getCell(6).getStringCellValue();
		
		email.sendKeys(data1);
		WebElement password = driver.findElement(By.id("Password"));
		password.sendKeys(data2);  
		driver.findElement(By.id("Login")).click();
		

	}

}
