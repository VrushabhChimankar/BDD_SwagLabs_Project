package RunnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features/LoginFeature.feature",
		tags = "@Sanity",
		glue = "StepDefinition", dryRun = false, monochrome = true
		
		)



public class Run {

}
