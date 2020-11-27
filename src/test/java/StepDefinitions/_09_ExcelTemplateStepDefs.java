package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class _09_ExcelTemplateStepDefs {
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

    @Then("^Create a new excel template$")
    public void createANewExcelTemplate() {
        dialogContent.findElementAndSendKeysFunction("excelTempNameInput", "BMW_DE_25");
        dialogContent.findElementAndSendKeysFunction("excelTempCountInput", "25");
        dialogContent.findElementAndClickFunction("saveButton");
        new Parent().waiting(1000);
        dialogContent.findElementAndSendKeysFunction("excelTempRowInput", "3");
        dialogContent.findElementAndSendKeysFunction("excelTempColumnInput", "3");
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
        dialogContent.findElementAndSendKeysFunction("excelTempNameInput", "BMW_DE_28");
        dialogContent.findElementAndSendKeysFunction("excelTempCountInput", "28");
        dialogContent.findElementAndClickFunction("tabVersionBtn");
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("excelTempRowInput", "5");
        dialogContent.findElementAndSendKeysFunction("excelTempColumnInput", "5");
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
}
