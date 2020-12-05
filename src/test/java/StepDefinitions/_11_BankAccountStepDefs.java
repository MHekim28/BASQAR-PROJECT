package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.Parent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class _11_BankAccountStepDefs {
    DialogContent dialogContent=new DialogContent();
    FormContent formContent=new FormContent();
    @Then("^Create a new bank account$")
    public void createANewBankAccount() {
        dialogContent.findElementAndSendKeysFunction("dialogInput1","Sparkasse_2825");
        dialogContent.findElementAndSendKeysFunction("dialogInput2","DE89 3704 0044 0532 2831 00");
        dialogContent.findElementAndClickFunction("bnkAccSelectCurrency");
        dialogContent.findElementAndClickFunction("option2");
        dialogContent.findElementAndSendKeysFunction("bankAccountCodeInput","252525");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @When("^Edit this bank account$")
    public void editThisBankAccount() {
        formContent.findElementAndSendKeysFunction("bankAccountSearchName","Sparkasse_2825");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        formContent.findElementAndClickFunction("editButton");
        new Parent().waiting(500);
        dialogContent.findElementAndSendKeysFunction("dialogInput1","Sparkasse_2828");
        dialogContent.findElementAndSendKeysFunction("dialogInput2","DE89 3804 0028 0532 2831 00");
        dialogContent.findElementAndClickFunction("bnkAccSelectCurrency");
        dialogContent.findElementAndClickFunction("option3");
        dialogContent.findElementAndSendKeysFunction("bankAccountCodeInput","282828");
        dialogContent.findElementAndClickFunction("saveButton");
    }

    @And("^Delete this bank account$")
    public void deleteThisBankAccount() {
        formContent.findElementAndSendKeysFunction("bankAccountSearchName","Sparkasse_2828");
        formContent.findElementAndClickFunction("searchButton");
        new Parent().waiting(500);
        dialogContent.findElementAndClickFunction("deleteButton");
        dialogContent.findElementAndClickFunction("yesButton");
    }
}
