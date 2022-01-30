package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TopDealsPage {
	
	public TopDealsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//*[@id=\"root\"]/div/header/div/div[3]/a[2]")
	private WebElement topDeals;
	
	@FindBy(how = How.XPATH, using="//input[@id='search-field']")
	private WebElement searchField;
	
	public void clickOnTopDeals() {
		topDeals.click();
	}
	
	public void enterItem(String itemName) {
		searchField.sendKeys(itemName);
	}
}
