package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _03_CountryAndCityStepDefs {
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    LeftNav leftNav=new LeftNav();
    @When("^Create a city$")
    public void createACity() {
        leftNav.findElementAndClickFunction("citiesButton");
        formContent.findElementAndClickFunction("addButton");
        dialogContent.findElementAndClickFunction("nameOfCountries");
        new Parent().waiting(1000);
        dialogContent.select("MyLand010203");
        dialogContent.findElementAndSendKeysFunction("inputName", "MeineStadt0102");
        dialogContent.findElementAndClickFunction("saveButton");

    }

    @Then("^Try to delete the created country and check that it cannot be deleted\\.$")
    public void tryToDeleteTheCreatedCountryAndCheckThatItCannotBeDeleted() {
        leftNav.findElementAndClickFunction("countriesButton");
        formContent.findElementAndSendKeysFunction("searchInputName","MyLand010203");
        formContent.findElementAndSendKeysFunction("searchInputCode","2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("formDeleteButton");
        dialogContent.findElementAndClickFunction("yesButton");


    }

    @Then("^the user should see the error message on the screen$")
    public void theUserShouldSeeTheErrorMessageOnTheScreen() {
        formContent.checkTheMessage("errorAlert","can't be deleted");
    }

    @And("^delete the city first to be able to delete the country$")
    public void deleteTheCityFirstToBeAbleToDeleteTheCountry() {
        leftNav.findElementAndClickFunction("citiesButton");
        formContent.findElementAndSendKeysFunction("searchInputName","MeineStadt0102");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }

    @Then("^now successfully delete the country$")
    public void nowSuccessfullyDeleteTheCountry() {
        leftNav.findElementAndClickFunction("countriesButton");
        formContent.findElementAndSendKeysFunction("searchInputName","MyLand010203");
        formContent.findElementAndSendKeysFunction("searchInputCode","2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("formDeleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }

}
