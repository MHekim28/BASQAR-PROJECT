package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class
_12_CostCentersStepDefs {
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @Then("^Create a Cost Centers$")
    public void createACostCenters() {
        dialogContent.findElementAndSendKeysFunction("costCenterNameInp","Herford2825");
        dialogContent.findElementAndSendKeysFunction("dialogInput1","252525");
        dialogContent.findElementAndClickFunction("costCenterSelectType");
        dialogContent.findElementAndClickFunction("option1");
        dialogContent.findElementAndSendKeysFunction("dialogInput2","11223344");
        dialogContent.findElementAndClickFunction("costCenterSelectCode");
        dialogContent.findElementAndClickFunction("option1");
        dialogContent.findElementAndClickFunction("saveButton");
        new Parent().waiting(1000);

    }

    @When("^Edit this Cost Centers$")
    public void editThisCostCenters() {
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("costCenterEditBtn");
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("costCenterNameInp","Herford2828");
        dialogContent.findElementAndSendKeysFunction("dialogInput1","282828");
        dialogContent.findElementAndClickFunction("costCenterSelectType");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndSendKeysFunction("dialogInput2","11223345");
        dialogContent.findElementAndClickFunction("costCenterSelectCode");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @And("^Delete this Cost Centers$")
    public void deleteThisCostCenters() {
        new Parent().waiting(1000);
        formContent.findElementAndClickFunction("costCenterDeleteBtn");
        dialogContent.findElementAndClickFunction("yesButton");
    }
}
