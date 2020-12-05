package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//NOT: Bütün Featurleri calistirdigi icin uzun sürüyor

@CucumberOptions(
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        dryRun = false

)
public class _01_TestRunnerAll extends AbstractTestNGCucumberTests {
}
