package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/file2.feature","src/test/resources/file3.feature","src/test/resources/file4.feature"},plugin="json:target/jsonreport.json",glue="stepdef")

public class runnerclass {

}
