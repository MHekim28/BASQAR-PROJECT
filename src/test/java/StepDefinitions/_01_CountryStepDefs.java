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
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();

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
            new Parent().waiting(500);
            new FormContent().findElementAndClickFunction(clickToElements.get(i));
        }
    }

    @And("^enter information in the Dialog Content$")
    public void enterInformationInTheDialogContent(DataTable elements) {
        List<List<String>> elementsNameAndValue = elements.asLists(String.class);

        for (int i = 0; i < elementsNameAndValue.size(); i++) {

            System.out.println(elementsNameAndValue.get(i).get(0));
            System.out.println(elementsNameAndValue.get(i).get(1));
            new Parent().waiting(200);
            new DialogContent().findElementAndSendKeysFunction(elementsNameAndValue.get(i).get(0), elementsNameAndValue.get(i).get(1));
        }
    }

    @Then("^Success message should be displayed$")
    public void successMessageShouldBeDisplayed() {

        new FormContent().checkTheMessage("successMessage", "successfully");
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


    @And("^Delete this Country$")
    public void deleteThisCountry() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName", "My Country_2825");
        formContent.findElementAndSendKeysFunction("searchInputCode", "28252825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

    }
}