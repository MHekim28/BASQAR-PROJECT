package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class _09_ExcelTemplateAndSalaryTypesStepDefs {
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

    @Then("^Create a new excel template$")
    public void createANewExcelTemplate() {
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "BMW_DE_25");
        dialogContent.findElementAndSendKeysFunction("dialogInput2", "25");
        dialogContent.findElementAndClickFunction("saveButton");
        new Parent().waiting(1000);
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "3");
        dialogContent.findElementAndSendKeysFunction("dialogInput2", "3");
        dialogContent.findElementAndClickFunction("addVersionButton");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndClickFunction("excelDialogCloseBtn");

    }

    @When("^Edit this excel template$")
    public void editThisExcelTemplate() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName", "BMW_DE_25");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("editButton");
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "BMW_DE_28");
        dialogContent.findElementAndSendKeysFunction("dialogInput2", "28");
        dialogContent.findElementAndClickFunction("tabVersionBtn");
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "5");
        dialogContent.findElementAndSendKeysFunction("dialogInput2", "5");
        dialogContent.findElementAndClickFunction("addVersionButton");
        dialogContent.findElementAndClickFunction("saveButton");
        dialogContent.findElementAndClickFunction("excelDialogCloseBtn");
    }

    @And("^Delete this excel template$")
    public void deleteThisExcelTemplate() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName", "BMW_DE_28");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @Then("^Create a new Salary Types$")
    public void createANewSalaryTypes() {
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "Thessaloniki2825");
        dialogContent.findElementAndClickFunction("selectUserType");
        dialogContent.findElementAndClickFunction("option1");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Edit this Salary Types$")
    public void editThisSalaryTypes() {
        new Parent().waiting(500);
        formContent.scroolToElement("SearchInputName2");
        formContent.findElementAndSendKeysFunction("SearchInputName2", "Thessaloniki2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("editButton");
        dialogContent.findElementAndSendKeysFunction("dialogInput1", "Athens2825");
        dialogContent.findElementAndClickFunction("cancelButton");
        dialogContent.findElementAndClickFunction("option1");
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @And("^Delete this Salary Types$")
    public void deleteThisSalaryTypes() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("SearchInputName2", "Athens2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }
}
