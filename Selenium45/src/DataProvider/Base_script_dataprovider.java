package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Base_script_dataprovider {

	@DataProvider
	public String[] passtestdata() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./resources/dec18.xlsx");
		Workbook work = WorkbookFactory.create(fis);
		int col = work.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells()-1;
		String[] passdata = new String[col];
		for (int i = 0; i < col; i++) {
			passdata[i] = work.getSheet("Sheet1").getRow(0).getCell(i + 1).toString();
		}
		return passdata;

	}

	@Test(dataProvider = "passtestdata")
	public void testingUsername(String data) {
		System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(data);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
