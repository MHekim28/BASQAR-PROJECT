package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {
    WebElement myElement;

    public LeftNav() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setup1Button;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parametersButton;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesButton;

    @FindBy(xpath = "//span[text()='Cities']")
    private WebElement citiesButton;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupFive;

    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subjects;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budget;

    @FindBy(xpath = "(//span[text()='Budget Accounts'])[1]")
    private WebElement budgetAccounts;

    @FindBy(xpath = "//ms-add-button//div")
    private WebElement addButtonBudget;



    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {
            case "setup1Button":
                myElement = setup1Button;
                break;

            case "parametersButton":
                myElement = parametersButton;
                break;

            case "countriesButton":
                myElement = countriesButton;
                break;

            case "citiesButton":
                myElement = citiesButton;
                break;

            case "education":
                myElement = education;
                break;

            case "setupFive":
                myElement = setupFive;
                break;

            case "subjects":
                myElement = subjects;
                break;

            case "addButton":
                myElement = addButton;
                break;

            case "budget":
                myElement = budget;
                break;

            case "budgetAccounts":
                myElement = budgetAccounts;
                break;

            case "addButtonBudget":
                myElement = addButtonBudget;
                break;

        }

        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {


        sendKeysFunction(myElement, value);
    }

    public  void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}

