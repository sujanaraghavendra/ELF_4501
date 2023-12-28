package DataProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class login_DWS {

	@DataProvider
	public String[][] login_details() {
		String[][] data = { { "sujana@gmail.com", "Sujana@123" }, { "Bhra@gmail.com", "Bhar@123" }

		};
		return data;
	}

	@Test(dataProvider = "login_details")
	public void details(String[] data) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys(data[0]);
		driver.findElement(By.id("Password")).sendKeys(data[1]);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
