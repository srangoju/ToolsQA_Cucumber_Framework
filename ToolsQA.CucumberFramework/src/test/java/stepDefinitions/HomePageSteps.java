package stepDefinitions;

import cucumber.api.java.en.Given;

import pageObjects.HomePage;

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
