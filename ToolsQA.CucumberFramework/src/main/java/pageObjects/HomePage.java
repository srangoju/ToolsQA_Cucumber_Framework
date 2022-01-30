package pageObjects;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class HomePage<ConfigFileReader> {
	
	private WebDriver driver;
	ConfigFileReader configFileReader;
	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";
	
	public HomePage(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void navigateToHomePage() {
		driver.get(((HomePage) configFileReader).getApplicationUrl());
	}

	private String getApplicationUrl() {
		String url = properties.getProperty("url");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
}
