package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        tags={"@SmokeTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue= {"StepDefinitions"},
        dryRun= false
)

public class _03_SmokeRunnerTest extends AbstractTestNGCucumberTests {
}
