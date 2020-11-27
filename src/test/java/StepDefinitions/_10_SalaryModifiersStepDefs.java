package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _10_SalaryModifiersStepDefs {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

    @Then("^Create a new Salary Modifiers$")
    public void createANewSalaryModifiers() {
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("slryModifDescriptionInput", "salary increase");
        dialogContent.findElementAndSendKeysFunction("slryModifVariableInput", "2825");
        dialogContent.findElementAndClickFunction("selectModifierType");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndClickFunction("selectValueType");
        dialogContent.findElementAndClickFunction("option1");
        dialogContent.findElementAndSendKeysFunction("slryModifPriorityInput", "25");
        dialogContent.findElementAndSendKeysFunction("slryModifAmountInput", "500");
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @When("^Edit it$")
    public void editIt() {
        new Parent().waiting(500);
        leftNav.findElementAndClickFunction("humanResoursec");
        leftNav.findElementAndClickFunction("setupHuman");
        leftNav.findElementAndClickFunction("salaryModifiers");
        formContent.findElementAndSendKeysFunction("modifSearchDescrInp", "salary increase");
        formContent.findElementAndSendKeysFunction("modifSearchVariableInp", "2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("editButton");
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("slryModifDescriptionInput", "salary increase2");
        dialogContent.findElementAndSendKeysFunction("slryModifVariableInput", "2828");
        dialogContent.findElementAndClickFunction("selectModifierType");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndClickFunction("selectValueType");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndSendKeysFunction("slryModifPriorityInput", "28");
        dialogContent.findElementAndSendKeysFunction("slryModifAmountInput", "1000");
        dialogContent.findElementAndClickFunction("saveButton");


    }

    @And("^Delete it$")
    public void deleteIt() {
        new Parent().waiting(500);
        leftNav.findElementAndClickFunction("humanResoursec");
        leftNav.findElementAndClickFunction("setupHuman");
        leftNav.findElementAndClickFunction("salaryModifiers");
        formContent.findElementAndSendKeysFunction("modifSearchDescrInp", "salary increase2");
        formContent.findElementAndSendKeysFunction("modifSearchVariableInp", "2828");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }


}
