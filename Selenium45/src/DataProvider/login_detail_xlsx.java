package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_detail_xlsx {
	@DataProvider
	public String[][] login() throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./resources/dec18.xlsx");
		Workbook work=WorkbookFactory.create(fis);
		Sheet datasheet = work.getSheet("Sheet2");
		int totalrow = datasheet.getPhysicalNumberOfRows();
		int totalcol = datasheet.getRow(0).getPhysicalNumberOfCells();
		String[][] details=new String[totalrow][totalcol];
		for(int i=0;i<totalrow;i++) {
			for(int j=0;j<totalcol;j++) {
				details[i][j]=datasheet.getRow(i).getCell(j).toString();
			}
		}
		return details;
	}
	
	@Test(dataProvider = "login")
	public void details(String[] details) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(details[0]);
		driver.findElement(By.id("Password")).sendKeys(details[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
