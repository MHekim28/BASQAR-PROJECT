package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class _02_CityStepDefs {
    DialogContent dialogContent = new DialogContent();
    FormContent formContent = new FormContent();
    LeftNav leftNav=new LeftNav();

    @Then("^Create and save a city$")
    public void createAndSaveACity() {
        dialogContent.findElementAndClickFunction("nameOfCountries");
        new Parent().waiting(500);
        dialogContent.select("MeinLand28");
        dialogContent.findElementAndSendKeysFunction("inputName", "Meine Stadt");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @Then("^delete a city$")
    public void deleteACity() {
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("countrySearchInput", "Meine Stadt");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @And("^also delete the country you created for the city$")
    public void alsoDeleteTheCountryYouCreatedForTheCity() {
        new Parent().waiting(500);
        leftNav.findElementAndClickFunction("countriesButton");
        new Parent().waiting(500);
        formContent.findElementAndSendKeysFunction("searchInputName","MeinLand28");
        formContent.findElementAndSendKeysFunction("searchInputCode","2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("formDeleteButton");
        dialogContent.findElementAndClickFunction("yesButton");

    }
}
