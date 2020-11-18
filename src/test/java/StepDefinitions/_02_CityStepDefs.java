package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.Then;

public class _02_CityStepDefs {
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @Then("^Create and save a city$")
    public void createAndSaveACity() {
        dialogContent.findElementAndClickFunction("nameOfCountries");
        new Parent().waiting(1000);
        dialogContent.select("Mein Land02");
        dialogContent.findElementAndSendKeysFunction("inputName","Meine Stadt");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @Then("^delete a city$")
    public void deleteACity() {
//        dialogContent.findElementAndClickFunction("nameOfCountries");
//        new Parent().waiting(1000);
//        dialogContent.waitUntilNeed("optionCountries");
//        dialogContent.select("Giresun05");
        dialogContent.waitUntilNeed("countrySearchInput");
        formContent.findElementAndSendKeysFunction("countrySearchInput","Meine Stadt");
        formContent.findElementAndClickFunction("searchButton");
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

    }
}
