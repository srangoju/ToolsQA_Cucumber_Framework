package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	WebDriver driver;

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page(){
		System.setProperty("webdriver.chrome.driver","F:\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("^he search for \"([^\"]*)\"$")
	public void he_search_for(String arg1)  {
		driver.findElement(By.xpath("//input[@placeholder='Search for Vegetables and Fruits']")).sendKeys(arg1);
		String exp_message = "Brocolli - 1 Kg";
		String actual = driver.findElement(By.cssSelector("#root > div > div.products-wrapper > div > div > h4")).getText();
		Assert.assertEquals(exp_message, actual);
	}

	@And("^click on Add to Cart$")
	public void click_on_Add_to_Cart() {

		driver.findElement(By.xpath("//button[normalize-space()='ADD TO CART']")).click();

	}

	@And("^click on bag$")
	public void click_on_bag() {

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

	}

	@And("^click on proceed to checkout$")
	public void click_on_proceed_to_checkout() {

		driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();

	}

	@And("^click on place order$")
	public void click_on_place_order() {

		driver.findElement(By.xpath("//button[normalize-space()='Place Order']")).click();

	}

	@And("^choose country$")
	public void choose_country(){

		WebElement chooseCountry = driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
		chooseCountry.click();	
		Select objSelect = new Select(chooseCountry);
		objSelect.selectByValue("India");
	}

	@And("^check Agree Terms and conditions$")
	public void check_agree_terms_and_conditions() {

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();

	}

	@And("^click on proceed button$")
	public void click_on_proceed_button() {

		driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();

	}
	@Then("^validate success message$")
	public void validate_success_message()  {
		String exp_message = "Thank you, your order has been placed successfully";
		String actual = driver.findElement(By.xpath("//span[contains(text(),\"Thank you, your order has been placed successfully\")]")).getText();
		Assert.assertEquals(exp_message, actual);
	}
}

	