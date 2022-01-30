package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;


public class HomePage {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	public HomePage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToHomePage() {
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}

	
}
