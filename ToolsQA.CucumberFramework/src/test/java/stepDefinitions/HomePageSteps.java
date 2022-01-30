package stepDefinitions;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ConfigFileReader;
import managers.PageObjectManager;
import managers.WebdriverManager;
import pageObjects.HomePage;
import pageObjects.TopDealsPage;

import cucumber.TestContext;

public class HomePageSteps {
	HomePage homePage;
	TestContext testContext;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		homePage=testContext.getPageObjectManager().getHomePage();
	}
	

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable{	
		homePage.navigateToHomePage();	
		
	}
	
}
