package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.Then;

public class _05_SubjectCategoriStepDefs {

    FormContent formContent=new FormContent();
    DialogContent dialogContent=new DialogContent();
    @Then("^Delete category$")
    public void deleteCategory() {
        formContent.findElementAndSendKeysFunction("searchInputName","IT/Software/Engineering/28");
        formContent.findElementAndSendKeysFunction("searchInputCode","28252825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

    }
}
