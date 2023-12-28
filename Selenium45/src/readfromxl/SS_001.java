package readfromxl;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

/***
 * @author Win11
 */

public class SS_001 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		// Steps to read data form Excel
		Workbook workbook = WorkbookFactory.create(new FileInputStream(new File("./resources/TC_for_Login.xlsx")));
//				
		String data = workbook.getSheet("Sheet1").getRow(25).getCell(6).toString();
		String[] arr = data.split("\n");
		String url = arr[0];
		String email = arr[1];
		String pwd = arr[2];

		// Expected Data
		String ShoppersStackPageTitle = "ShoppersStack";
		String homePageTitle = "ShoppersStack | Login";

		// Test step 1 : Open the browser and enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		System.out.println(driver.getTitle());
		String actualShoppersStackPageTitle = driver.getTitle();
		Assert.assertEquals(actualShoppersStackPageTitle, ShoppersStackPageTitle, "ShopperStack is not displayed");
//				if (actualShoppersStackPageTitle.equals(ShoppersStackPageTitle)) {
//					System.out.println("ShopperStack is displayed");
//				} else {
//					System.out.println("ShopperStack is not displayed");
//				}

		// Test step 2 : Click on Login in button
		driver.findElement(By.id("loginBtn")).click();

		// Test step 3 : Enter given data in Username or email txt field
		WebElement emailid = driver.findElement(By.id("Email"));
		emailid.clear();
		emailid.sendKeys(email);
		String emailentered = emailid.getAttribute("value");

		if (emailentered.equals(email)) {
			System.out.println("email was entered sucessfully");
		} else {
			System.out.println("email was not entered sucessfully");
		}

		// Test step 4 : Enter given data in password txt field
		WebElement passwordid = driver.findElement(By.id("Password"));
		passwordid.clear();
		passwordid.sendKeys(pwd);
		String passwordEntered = passwordid.getAttribute("value");
		if (passwordEntered.equals(pwd)) {
			System.out.println("Password was entered sucessfully");
		} else {
			System.out.println("Password was not entered sucessfully");
		}

		// Test step 5 : Click on LogIn button
		driver.findElement(By.id("Login")).click();
		System.out.println(driver.getTitle());
		String actualhomePageTitle = driver.getTitle();
		SoftAssert ref = new SoftAssert();
		ref.assertEquals(actualhomePageTitle, homePageTitle, "home page is not displayed");
//				
//				if (actualhomePageTitle.equals(homePageTitle)) {
//					System.out.println("home page is displayed");
//				} else {
//					System.out.println("home page is not displayed");
//				}
		ref.assertAll();

	}

}
