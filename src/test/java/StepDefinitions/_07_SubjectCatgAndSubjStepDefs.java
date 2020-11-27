package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _07_SubjectCatgAndSubjStepDefs {
    FormContent formContent = new FormContent();
    DialogContent dialogContent = new DialogContent();
    LeftNav leftNav = new LeftNav();

    @Then("^Add a subject to this category$")
    public void addASubjectToThisCategory() {
        leftNav.findElementAndClickFunction("subjects");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndSendKeysFunction("inputName","mySubject2825");
        dialogContent.findElementAndSendKeysFunction("inputCode","28282828");
        dialogContent.findElementAndClickFunction("selectSubjectCategory");
        new Parent().waiting(1000);
        dialogContent.select("MySubjectCategory2825");
        dialogContent.findElementAndClickFunction("selectSubjectStyle");
        dialogContent.findElementAndClickFunction("option1");
        dialogContent.findElementAndClickFunction("saveButton");


    }

    @When("^Now try to delete the category\\. The category should not be deleted\\.$")
    public void nowTryToDeleteTheCategoryTheCategoryShouldNotBeDeleted() {
        leftNav.scroolToElement("subjectCategories");
        leftNav.findElementAndClickFunction("subjectCategories");
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName","MySubjectCategory2825");
        formContent.findElementAndSendKeysFunction("searchInputCode","28252825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

    }

    @And("^To delete the category, first delete the subject you created$")
    public void toDeleteTheCategoryFirstDeleteTheSubjectYouCreated() {
        leftNav.findElementAndClickFunction("subjects");
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName","mySubject2825");
        formContent.findElementAndSendKeysFunction("searchInputCode","28282828");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @Then("^Now successfully delete the Subject category$")
    public void nowSuccessfullyDeleteTheSubjectCategory() {
        leftNav.scroolToElement("subjectCategories");
        leftNav.findElementAndClickFunction("subjectCategories");
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName","MySubjectCategory2825");
        formContent.findElementAndSendKeysFunction("searchInputCode","28252825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }


}
