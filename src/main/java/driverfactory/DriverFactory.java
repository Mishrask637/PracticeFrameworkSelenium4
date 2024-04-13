package driverfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	
	
	public static void setDriver() {
		
		if(driver.get() == null) {
			driver.set(new ChromeDriver());
		}
	}
	
	public static WebDriver getDriver()
	{
		return driver.get();
	}
	
}
