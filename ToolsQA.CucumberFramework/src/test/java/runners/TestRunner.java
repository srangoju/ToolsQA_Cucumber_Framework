package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/functionalTests/End2End_Test.feature",
				glue= {"runners.Steps"},
				plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
									"junit:target/cucumber-reports/Cucumber.xml",
									"html:target/cucumber-reports"},
				monochrome = true
				
		
				)

//@CucumberOptions(plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"})

public class TestRunner {
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
