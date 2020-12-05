package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _10_SalaryModifiersAndConstantsStepDefs {

    LeftNav leftNav = new LeftNav();
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

    @Then("^Create a new Salary Modifiers$")
    public void createANewSalaryModifiers() {
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("slryModifDescriptionInput", "salary increase");
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "2825");
        dialogContent.findElementAndClickFunction("selectModifierType");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndClickFunction("selectValueType");
        new Parent().waiting(200);
        dialogContent.findElementAndClickFunction("option2");
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
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "2828");
        dialogContent.findElementAndClickFunction("selectModifierType");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndClickFunction("selectValueType");
        new Parent().waiting(200);
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


    @Then("^Create a new Salary Constants$")
    public void createANewSalaryConstants() {
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("salaryConstName","Mein_Salary_Constants_28");
        dialogContent.findElementAndClickFunction("salaryConstValidBtn");
        new Parent().waiting(200);
        dialogContent.selectDay();
        dialogContent.findElementAndSendKeysFunction("salaryConstKey","MSC2825");
        dialogContent.findElementAndSendKeysFunction("salaryConstValue","2825282500");
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @When("^Edit this Salary Constants$")
    public void editThisSalaryConstants() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("salaryConstantsName","Mein_Salary_Constants_28");
        formContent.findElementAndSendKeysFunction("salaryConstantsKey","MSC2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("editButton");
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("salaryConstName","Mein_Salary_Constants_2825");
        dialogContent.findElementAndClickFunction("salaryConstValidBtn");
        dialogContent.selectDay();
        dialogContent.findElementAndSendKeysFunction("salaryConstKey","MSC2828");
        dialogContent.findElementAndSendKeysFunction("salaryConstValue","00002825");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @And("^Delete this Salary Constants$")
    public void deleteThisSalaryConstants() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("salaryConstantsName","Mein_Salary_Constants_2825");
        formContent.findElementAndSendKeysFunction("salaryConstantsKey","MSC2828");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }
}
