package StepDefinitions;

import Pages.FormContent;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebElement;

public class BudgetStepDefs {
    @Then("^select category name as \"([^\"]*)\"$")
    public void selectCategoryNameAs(String elementName) {
        new FormContent().findElementAndClickFunction(elementName);

    }
}
