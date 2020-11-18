package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class _01_CountryStepDefs {
    @And("^Click to elements in the left Class$")
    public void clickToElementsInTheLeftClass(DataTable elements) {

        List<String> clickToElements = elements.asList(String.class);
        for (int i = 0; i < clickToElements.size(); i++) {
            System.out.println(clickToElements.get(i));
            new LeftNav().findElementAndClickFunction(clickToElements.get(i));

        }

    }
    @And("^Click to elements in the FormContent$")
    public void clickToElementsInTheFormContent(DataTable elements) {
        List<String> clickToElements = elements.asList(String.class);

        for (int i = 0; i < clickToElements.size(); i++) {

            new FormContent().findElementAndClickFunction(clickToElements.get(i));
        }
    }
    @And("^enter information in the Dialog Content$")
    public void enterInformationInTheDialogContent(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            new DialogContent().findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

        new FormContent().findElementAndVerifyContainsText("successMessage", "successfully");
    }
    @And("^enter information in the FormContent$")
    public void enterInformationInTheFormContent(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            new FormContent().findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }


    @And("^Click to elements in the Dialog Content$")
    public void clickToElementsInTheDialogContent(DataTable elements) {
        List<String> clickToElements = elements.asList(String.class);
        for (int i = 0; i < clickToElements.size(); i++) {
            System.out.println(clickToElements.get(i));
            new DialogContent().findElementAndClickFunction(clickToElements.get(i));

        }
    }

    @Then("^Error message should be displayed$")
    public void errorMessageShouldBeDisplayed() throws InterruptedException {
        new FormContent().findElementAndVerifyContainsText("errorMessage", "Error");
        new Parent().wait(3000);
    }


}