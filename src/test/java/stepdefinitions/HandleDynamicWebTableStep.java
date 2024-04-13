package stepdefinitions;

import org.openqa.selenium.WebDriver;
import driverfactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.AutomationPracticePage;

public class HandleDynamicWebTableStep {
	
	public WebDriver driver ;
	public AutomationPracticePage APPractice;
	
	
	@Given("I am on Automation Practice WebPage")
	public void i_am_on_automation_practice_web_page() {
		driver = DriverFactory.getDriver();
	    APPractice = new AutomationPracticePage(driver);
	    driver.get("https://cosmocode.io/automation-practice-webtable/");
	}
	
	@When("I click on {string}")
	public void i_click_on(String country) {
		APPractice.clickOnCountry(country);
	}
	
	@Then("I get capital,currency & primary Languages of {string}")
	public void i_get_capital_currency_primary_languages_of(String country) {
		 APPractice.printDetailsOf(country);
	}

}
