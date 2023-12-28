package configure;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_script {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("from before suite", true);
	}

	@BeforeTest
	public void beforetest() {
		Reporter.log("from before test", true);
	}

	@BeforeMethod
	public void beforetmethod() {
		Reporter.log("from before method", true);
	}

	@BeforeClass
	public void beforeclass() {
		Reporter.log("from before class", true);
	}

	@AfterSuite
	public void Aftersuite() {
		Reporter.log("from After suite", true);
	}

	@AfterTest
	public void Aftertest() {
		Reporter.log("from After test", true);
	}

	@AfterMethod
	public void Aftertmethod() {
		Reporter.log("from After method", true);
	}

	@AfterClass
	public void Afterclass() {
		Reporter.log("from After class", true);
	}

	@Test
	public void run() {
		Reporter.log("from run class", true);

	}

	@Test
	public void shop() {
		Reporter.log("from shop class", true);

	}

}
