package Runners;

import Utilities.Driver;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(
        tags = {"@WipTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue = {"StepDefinitions"},
        plugin = {

                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        }
)
public class _07_TestRunnerParallelTest extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser2")
    public static void beforeClass(String browser1) {

        Driver.threadBrowserName.set(browser1);

    }

    @AfterClass
    public static void afterClass() {
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("User Name", "Grup-6");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");

    }
}
