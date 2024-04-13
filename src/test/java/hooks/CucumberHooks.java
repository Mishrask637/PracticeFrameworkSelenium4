package hooks;

import org.openqa.selenium.WebDriver;

import driverfactory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import utility.GenerateCucumberReports;

public class CucumberHooks {

	WebDriver driver; 
	
	@Before
	public void setup() {
		DriverFactory.setDriver();
		DriverFactory.getDriver().manage().window().maximize();
		DriverFactory.getDriver().manage().deleteAllCookies();
	}
	
	@After
	public void tearDown() {
		DriverFactory.getDriver().quit();
		DriverFactory.driver.set(null);
	}
	
	@AfterAll
	public static void afterAll() {
		GenerateCucumberReports reports = new GenerateCucumberReports();
		reports.generateCucumberReports();
	}
}
