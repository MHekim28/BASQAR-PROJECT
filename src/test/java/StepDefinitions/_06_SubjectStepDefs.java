package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _06_SubjectStepDefs {
    FormContent formContent=new FormContent();
    DialogContent dialogContent=new DialogContent();
    @Then("^Delete subject$")
    public void deleteSubject() {
        formContent.findElementAndSendKeysFunction("searchInputName","Turkish/IT/Software/28");
        formContent.findElementAndSendKeysFunction("searchInputCode","28252825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }


}
