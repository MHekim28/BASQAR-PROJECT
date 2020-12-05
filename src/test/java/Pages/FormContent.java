package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FormContent extends Parent {
    WebElement myElement;

    public FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "(//ms-text-field/input)[1]")
    private WebElement searchInputName;

    @FindBy(xpath = "(//ms-text-field/input)[2]")
    private WebElement searchInputCode;

    @FindBy(xpath = "//span[text()=' Search ']")
    private WebElement searchButton;

    @FindBy(xpath = "(//ms-delete-button[@class='ng-star-inserted']/button)[1]")
    private WebElement formDeleteButton;

    @FindBy(xpath = "//div[@id='mat-select-value-5']/span")
    private WebElement nameOfCountries2;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement countrySearchInput;

    @FindBy(css = "mat-select#mat-select-4")
    private WebElement selectCountries;

    @FindAll({@FindBy(css = "//span[@class='mat-option-text']")})
    private List<WebElement> optionCountries;

    @FindBy(xpath = "//h3[text()='  Dashboard ']")
    public WebElement dashboardText;

    @FindBy(xpath = "(//span[text()='Country'])[1]")
    private WebElement cityCountrySearch;

    @FindBy(xpath = "//div[@class='mat-form-field-infix ng-tns-c149-43']/input")
    private WebElement salarySearchNameInput;

    @FindBy(xpath = "(//ms-edit-button/button)[1]")
    private WebElement editButton;

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement modifSearchDescrInp;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement modifSearchVariableInp;

    @FindBy(xpath = "(//ms-text-field//input)[1]")
    private WebElement bankAccountSearchName;

    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    private WebElement costCenterDeleteBtn;

    @FindBy(xpath = "(//ms-edit-button)[1]")
    private WebElement costCenterEditBtn;

    @FindBy(id = "toast-container")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[@role='alertdialog']")
    private WebElement errorAlert;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'FIELD.ADD')]//button")
    private WebElement excelTemplateAddBtn;

    @FindBy(xpath = "//mat-form-field//input")
    private WebElement SearchInputName2;

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement salaryConstantsName;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement salaryConstantsKey;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    private WebElement addButton2;

    public void findElementAndClickFunction(String ElementName) {


        switch (ElementName) {

            case "addButton":
                myElement = addButton;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "nameOfCountries2":
                myElement = nameOfCountries2;
                break;

            case "selectCountries":
                myElement = selectCountries;
                break;

            case "formDeleteButton":
                myElement=formDeleteButton;
                break;

            case "editButton":
                myElement=editButton;
                break;

            case "costCenterDeleteBtn":
                myElement=costCenterDeleteBtn;
                break;

            case "costCenterEditBtn":
                myElement=costCenterEditBtn;
                break;

            case "excelTemplateAddBtn":
                myElement=excelTemplateAddBtn;
                break;

            case "addButton2":
                myElement=addButton2;
                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "searchInputName":
                myElement = searchInputName;
                break;

            case "searchInputCode":
                myElement = searchInputCode;
                break;

            case "countrySearchInput":
                myElement = countrySearchInput;
                break;

            case "cityCountrySearch":
                myElement=cityCountrySearch;
                break;

            case "salarySearchNameInput":
                myElement=salarySearchNameInput;
                break;

            case "modifSearchDescrInp":
                myElement=modifSearchDescrInp;
                break;

            case "modifSearchVariableInp":
                myElement=modifSearchVariableInp;
                break;

            case "bankAccountSearchName":
                myElement=bankAccountSearchName;
                break;

            case "SearchInputName2":
                myElement=SearchInputName2;
                break;

            case "salaryConstantsName":
                myElement=salaryConstantsName;
                break;

            case "salaryConstantsKey":
                myElement=salaryConstantsKey;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void checkTheMessage(String ElementName, String message) {
        switch (ElementName) {
            case "successMessage":
                myElement = successMessage;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;

            case "errorAlert":
                myElement=errorAlert;
                break;
        }

        verifyElementContainsText(myElement, message);
    }

    public void select(String value) {

        for (WebElement option : optionCountries) {

            if (option.getText().equals(value)) {
                clickFunction(option);
                break;
            }
        }
    }
    public  void scroolToElement(String elementName) {

        switch (elementName) {

            case "SearchInputName2":
                myElement=SearchInputName2;
                break;

        }
        scrollToElement(myElement);
    }
    public void elementShoulBeVisible(String elementName){

        switch (elementName){
            case "addButton":
                myElement=addButton;
                break;
        }

        waitUntilVisible(myElement);
    }
}

