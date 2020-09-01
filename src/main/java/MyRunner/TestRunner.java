package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(features = "C:\\Users\\Ramki\\workspace\\FreeCRMBDDFramework\\src\\main\\java\\features\\tagging.feature",
glue = {
"stepDefinitions" },
plugin = { "pretty", "html:target/html/cucumber-pretty.html",
		"json:target/json/cucumber.json",
"junit:target/xml/cucumber.xml" },
monochrome = true,
//tags= "@SmokeTest", //Use this if tagging is used in feature files
dryRun = false
		)

public class TestRunner {

}
