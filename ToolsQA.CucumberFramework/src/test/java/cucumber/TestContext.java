package cucumber;

import managers.WebdriverManager;
import managers.PageObjectManager;

public class TestContext {
	private WebdriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		webDriverManager = new WebdriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebdriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
