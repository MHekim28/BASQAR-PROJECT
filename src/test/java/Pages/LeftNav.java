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

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategories;

    @FindBy(xpath = "//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupFive;

    @FindBy(xpath = "(//span[text()='Subjects'])[1]")
    private WebElement subjects;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//span[text()='Human Resources']")
    private WebElement humanResoursec;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHuman;

    @FindBy(xpath = "(//span[text()='Position Salary'])[1]")
    private WebElement positionSalary;

    @FindBy(xpath = "(//span[text()='Reports'])[4]")
    private WebElement reportsButton;

    @FindBy(xpath = "(//span[text()='Setup'])[7]")
    private WebElement reportSetupButton;

    @FindBy(xpath = "//span[text()='Excel Template']")
    private WebElement excelTemplate;

    @FindBy(xpath = "//span[text()='Salary Modifiers']")
    private WebElement salaryModifiers;

    @FindBy(xpath = "(//span[text()='Bank Accounts'])[1]")
    private WebElement bankAccount;

    @FindBy(xpath = "//span[text()='Budget']")
    private WebElement budgetButton;

    @FindBy(xpath = "(//span[text()='Setup'])[6]")
    private WebElement budgetSetupButton;

    @FindBy(xpath = "(//span[text()='Cost Centers'])[1]")
    private WebElement costCentersButton;


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

            case "budgetButton":
                myElement = budgetButton;
                break;

            case "subjectCategories":
                myElement=subjectCategories;
                break;

            case "humanResoursec":
                myElement=humanResoursec;
                break;

            case "setupHuman":
                myElement=setupHuman;
                break;

            case "positionSalary":
                myElement=positionSalary;
                break;

            case "salaryModifiers":
                myElement=salaryModifiers;
                break;

            case "bankAccount":
                myElement=bankAccount;
                break;

            case "budgetSetupButton":
                myElement=budgetSetupButton;
                break;

            case "costCentersButton":
                myElement=costCentersButton;
                break;

            case "reportsButton":
                myElement=reportsButton;
                break;

            case "reportSetupButton":
                myElement=reportSetupButton;
                break;

            case "excelTemplate":
                myElement=excelTemplate;
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
    public void waitUntilNeed(String elementName) {

        switch (elementName) {
            case "countriesButton":
                myElement = countriesButton;
                break;

            case "citiesButton":
                myElement = citiesButton;
                break;


        }

        waitUntilVisible(myElement);
    }
    public  void scroolToElement(String elementName) {

        switch (elementName) {
            case "subjectCategories":
                myElement=subjectCategories;
                break;


        }
        scrollToElement(myElement);
    }
}

