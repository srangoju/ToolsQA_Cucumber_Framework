package runners;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
				features = "src/test/resources/functionalTests/End2End_Test.feature",
				glue= {"runners.Steps"}
		
				)

public class TestRunner {

}
