package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _08_PositionSalaryStepDefs {
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @When("^Edit and delete position Salary$")
    public void editAndDeletePositionSalary() {
        dialogContent.findElementAndSendKeysFunction("inputSalaryName","NTL2825");
        dialogContent.findElementAndClickFunction("saveButton");
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("salarySearchNameInput","NTL2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("editButton");
        dialogContent.findElementAndSendKeysFunction("inputSalaryName","STL2825");
        dialogContent.findElementAndClickFunction("saveButton");
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("salarySearchNameInput","STL2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");


    }

}
