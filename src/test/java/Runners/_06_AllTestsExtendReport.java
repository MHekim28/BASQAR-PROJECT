package Runners;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

@CucumberOptions(
        tags={"@RegressionTest"},
        features = {"src/test/java/FeaturesFiles"},
        glue= {"StepDefinitions"},
        plugin={

                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport/ExtentReportRegression.html"
        }
)
public class _06_AllTestsExtendReport extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void afterClass(){
        Reporter.loadXMLConfig("src/test/java/XMLFiles/extendReportSet.xml");

        Reporter.setSystemInfo("User Name", "Grup-6");
        Reporter.setSystemInfo("Application Name", "Basqar");
        Reporter.setSystemInfo("Operating System Info", System.getProperty("os.name"));
        Reporter.setSystemInfo("Department", "QA");
        Reporter.setSystemInfo("Test Sonucu", "Group-6 has successfully completed Basqar Project.");
        Reporter.setTestRunnerOutput("Test excetuion Cucumber report");

    }
}
