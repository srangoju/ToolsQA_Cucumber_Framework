package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.HomePage;
import pageObjects.TopDealsPage;

public class PageObjectManager {
	
	private WebDriver driver;
	public HomePage homePage;
	public TopDealsPage topDealsPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}
	
	public TopDealsPage getTopDealsPage() {
		return (topDealsPage == null) ? topDealsPage = new TopDealsPage(driver) : topDealsPage;
		
	}

}
