package popups;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class hidden {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver.driver", "./driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.agoda.com/");
		LocalDateTime ldt = LocalDateTime.now();
		String monthName = ldt.getMonth().name();
		monthName = "" + monthName.substring(0, 1).toUpperCase() + monthName.substring(1).toLowerCase();
		int Yearnum = ldt.getYear();
		int date = ldt.getDayOfMonth();
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-selenium='checkInBox']")).click();
		Thread.sleep(1000);
		for (;;) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			try {
				driver.findElement(By.xpath("//div[text()='" + monthName + " " + (Yearnum + 1) + "']/..//span[text()='"
						+ (date - 2) + "']")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//div[text()='" + monthName + " " + (Yearnum + 1) + "']/..//span[text()='"
						+ (date - 1) + "']")).click();
				break;

			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}

	}

}
