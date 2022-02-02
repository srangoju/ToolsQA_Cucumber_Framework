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

public class Steps {
	WebDriver driver;
	HomePage homePage;
	TopDealsPage topDealsPage;
	PageObjectManager pageObjectManager;
	ConfigFileReader configFileReader;
	WebdriverManager webDriverManager;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable{	
		webDriverManager = new WebdriverManager() ;
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateToHomePage();	
		
	}
	
	@When("^click on top dealers link$")
	public void click_on_top_dealers_link() throws Throwable {	
		pageObjectManager = new PageObjectManager(driver);
		topDealsPage = pageObjectManager.getTopDealsPage();
		topDealsPage.clickOnTopDeals();

	}

	@When("^user navigate to top deals page$")
	public void user_navigate_to_top_deals_page() throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		topDealsPage = pageObjectManager.getTopDealsPage();
		topDealsPage.enterItem("Wheat");
		
		//div[@class='brand greenLogo']//div[@class='brand greenLogo']
	}
	
	@Then("^enter item in searchbox$")
	public void enter_item_in_searchbox() throws Throwable {
		pageObjectManager = new PageObjectManager(driver);
		topDealsPage = pageObjectManager.getTopDealsPage();
		topDealsPage.enterItem("Wheat");
	}
	
}

	/*
	 * @When("^he search for \"([^\"]*)\"$") public void he_search_for(String arg1)
	 * throws Throwable { driver.findElement(By.
	 * xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(
	 * arg1); String exp_message = "Brocolli - 1 Kg"; String actual =
	 * driver.findElement(By.
	 * cssSelector("#root > div > div.products-wrapper > div > div > h4")).getText()
	 * ; Assert.assertEquals(exp_message, actual); }
	 * 
	 * @When("^click on Add to Cart$") public void click_on_Add_to_Cart() throws
	 * Throwable{
	 * 
	 * driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).
	 * click();
	 * 
	 * }
	 * 
	 * @When("^click on bag$") public void click_on_bag() throws Throwable{
	 * 
	 * driver.findElement(By.xpath("//img[@alt='Cart']")).click();
	 * 
	 * }
	 * 
	 * @When("^click on proceed to checkout$") public void
	 * click_on_proceed_to_checkout() throws Throwable{
	 * 
	 * driver.findElement(By.
	 * xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();
	 * 
	 * }
	 * 
	 * @When("^click on place order$") public void click_on_place_order() throws
	 * Throwable{
	 * 
	 * driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).
	 * click();
	 * 
	 * }
	 * 
	 * @When("^choose country$") public void choose_country() throws Throwable{
	 * 
	 * WebElement chooseCountry =
	 * driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
	 * chooseCountry.click(); Select objSelect = new Select(chooseCountry);
	 * objSelect.selectByValue("India"); }
	 * 
	 * @When("^check Agree Terms and conditions$") public void
	 * check_agree_terms_and_conditions() throws Throwable{
	 * 
	 * driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	 * 
	 * }
	 * 
	 * @When("^click on proceed button$") public void click_on_proceed_button()
	 * throws Throwable{
	 * 
	 * driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click()
	 * ;
	 * 
	 * }
	 * 
	 * @Then("^validate success message$") public void validate_success_message()
	 * throws Throwable{ String exp_message =
	 * "Thank you, your order has been placed successfully"; String actual =
	 * driver.findElement(By.
	 * xpath("//span[contains(text(),\"Thank you, your order has been placed successfully\")]"
	 * )).getText(); Assert.assertEquals(exp_message, actual); }
	 * 
	 *     When he search for "Brocolli"
    When click on Add to Cart
    When click on bag 
    When click on proceed to checkout
    When click on place order
    When choose country
    When check Agree Terms and conditions
    When click on proceed button
    Then validate success message
	 */

	