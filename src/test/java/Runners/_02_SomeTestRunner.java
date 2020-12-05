package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/FeaturesFiles/_01_CreateCountry.feature","src/test/java/FeaturesFiles/_02_CreateCity.feature"},
        glue = {"StepDefinitions"},
        dryRun = false
)
public class _02_SomeTestRunner  extends AbstractTestNGCucumberTests {
}
