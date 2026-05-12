package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		format = {"pretty"},
		features = {"src/cucumber/"},
		glue={"StepDefinitions"},
		plugin = {"html:CucumberTest/cucumber-html-report",
				"json:CucumberTest/cucumber.json"}
		)

public class CucumberRunner {

}
