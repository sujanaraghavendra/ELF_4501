package handling_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class interviewdropdown {

	public static void selectLastOption(WebElement dropdown)
	{
		Select listbox=new Select(dropdown);
		int totalNoOptions=listbox.getOptions().size();
		listbox.selectByIndex(totalNoOptions-1);
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.facebook.com/signup");
		WebElement daydrop = driver.findElement(By.id("day"));
		WebElement monthdrop = driver.findElement(By.id("month"));
		WebElement yeardrop = driver.findElement(By.id("year"));
		selectLastOption(daydrop);
		selectLastOption(monthdrop);
		selectLastOption(yeardrop);
	}
}