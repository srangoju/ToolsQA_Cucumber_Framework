package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TopDealsPage;

public class TopDealsPageSteps {
	public class HomePageSteps {
		TopDealsPage topDealsPage;
		TestContext testContext;
	
	@When("^click on top dealers link$")
	public void click_on_top_dealers_link() throws Throwable {	
		topDealsPage.clickOnTopDeals();

	}

	@Then("^user should navigate to top deals page$")
	public void user_should_navigate_to_top_deals_page() throws Throwable {
		topDealsPage.enterItem("Wheat");
	}
	
}
}
