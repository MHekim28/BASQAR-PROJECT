package Pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent {
    WebElement myElement;

    public FormContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(css = "(//ms-text-field/input)[1]")
    private WebElement searchInputName;

    @FindBy(css = "ms-text-field[id='ms-text-field-1']>input")
    private WebElement searchInputCode;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//div[@id='mat-select-value-5']/span")
    private WebElement nameOfCountries2;

    @FindBy(xpath = "//input[@id='ms-text-field-0']")
    private WebElement countrySearchInput;

//    @FindBy(xpath = "//input[@id='ms-text-field-7']")
//    private WebElement inputCountryName;
//
//    @FindBy(xpath = "//input[@id='ms-text-field-8']")
//    private WebElement inputCountryCode;
//
////    @FindBy(xpath ="//input[@id='ms-text-field-3']" )
////    private WebElement
//
//    @FindBy(xpath = "(//input[starts-with(@id,'ms-text-field')])[3]")
//    private WebElement nameInput;
//
//    @FindBy(xpath = "(//input[starts-with(@id,'ms-text-field')])[4]")
//    private WebElement codeInput;
//
//   @FindBy(id = "mat-select-value-9")
//    private WebElement subjectCategory;
//
//    @FindBy(xpath = "(//input[starts-with(@id,'ms-text-field')])[5]")
//    private WebElement subjectCategoryName;
//
//    @FindBy(xpath= "(//input[starts-with(@id,'ms-text-field')])[6]")
//    private WebElement subjectCategoryCode;
//
//    @FindBy (xpath="(//span[@class='mat-option-text'])[1]")
//    private WebElement option1;
//
//    @FindBy (xpath="(//span[@class='mat-option-text'])[2]")
//    private WebElement option2;
//
//    @FindBy (xpath="(//span[@class='mat-option-text'])[3]")
//    private WebElement option3;
//
//    @FindBy (xpath="(//span[@class='mat-option-text'])[4]")
//    private WebElement option4;
//
//    @FindBy(id= "mat-select-value-11")
//    private WebElement selectStyle;
//
//    @FindBy(xpath="//input[@id='ms-text-field-0']")
//    private WebElement deleteSearchName;
//
//    @FindBy(xpath="//input[@id='ms-text-field-1']")
//    private WebElement deleteSearchCode;

    @FindBy(id="toast-container")
    private WebElement successMessage;

    @FindBy(xpath = "//div[contains(text(),'Error')]")
    private WebElement errorMessage;
//
//    @FindBy(xpath="//input[@id='ms-text-field-1']")
//    private WebElement budgetCodeInput;
//
//    @FindBy(xpath="//input[@id='ms-text-field-2']")
//    private WebElement budgetNameInput;
//
//    @FindBy(id="mat-select-value-13")
//    private WebElement budgetCategory;
//
//    @FindBy(id="mat-select-value-15")
//private WebElement budgetType;
//
//    @FindBy(id="mat-select-value-17")
//    private WebElement budgetBalanceType;
//
//    @FindBy(id="mat-select-value-19")
//    private WebElement budgetCurrency;
//
//    @FindBy(xpath = "//ms-save-button/button")
//    private WebElement budgetSaveButton;
//
//    @FindBy(id="mat-select-value-41")
//    private WebElement budgetSubcategory;
//
//    @FindBy(xpath = "//input[@id='ms-text-field-3']")
//    private WebElement budgetDeleteName;
//
//    @FindBy(xpath = "//input[@id='mat-input-9']")
//    private WebElement budgetDeleteCode;
//
//    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-2']")
//    private WebElement formula;
//
//    @FindBy(xpath = "(//ms-add-button//div)[1]")
//    private WebElement formulaAddButton;
//
//    @FindBy(xpath = "//*[@id='mat-expansion-panel-header-3']")
//    private WebElement contraAccount;
//
//    @FindBy(xpath = "(//ms-add-button//div)[2]")
//    private WebElement contraAccountAdd;
//
//    @FindBy(id="mat-select-value-59")
//    private WebElement budgetType2;
//
//    @FindBy(xpath = "//span[text()=' Expense ']")
//    private WebElement expense;
//
//    @FindBy(xpath = "//span[text()=' Income ']")
//    private WebElement income;
//
//    @FindBy(xpath = "//span[text()=' Investment ']")
//    private WebElement investment;
//
//    @FindBy(xpath = "//span[text()=' Salary ']")
//    private WebElement salary;

    public void findElementAndClickFunction(String ElementName) {


        switch (ElementName) {

//            case "subjectAddButton":
//                myElement = subjectAddButton;
//                break;

            case "addButton":
                myElement=addButton;
                break;

            case "searchButton":
                myElement = searchButton;
                break;

            case "nameOfCountries2":
                myElement = nameOfCountries2;
                break;

//            case "subjectCategory":
//                myElement = subjectCategory;
//                break;
//
//            case "option1":
//                myElement = option1;
//                break;
//
//            case "option2":
//                myElement = option2;
//                break;
//
//            case "option3":
//                myElement = option3;
//                break;
//
//            case "option4":
//                myElement = option4;
//                break;
//
//            case "selectStyle":
//                myElement = selectStyle;
//                break;
//
//            case "budgetCategory":
//                myElement=budgetCategory;
//                break;
//
//            case "budgetType":
//                myElement=budgetType;
//                break;
//
//            case "budgetBalanceType":
//                myElement=budgetBalanceType;
//                break;
//
//            case "budgetCurrency":
//                myElement=budgetCurrency;
//                break;
//
//            case "budgetSaveButton":
//                myElement=budgetSaveButton;
//                break;
//
//            case "budgetSubcategory":
//                myElement=budgetSubcategory;
//                break;
//
//            case "budgetDeleteName":
//                myElement=budgetDeleteName;
//                break;
//
//            case "budgetDeleteCode":
//                myElement=budgetDeleteCode;
//                break;
//
//            case "formula":
//                myElement=formula;
//                break;
//
//            case "formulaAddButton":
//                myElement=formulaAddButton;
//                break;
//
//            case "contraAccount":
//                myElement=contraAccount;
//                break;
//
//            case "contraAccountAdd":
//                myElement=contraAccountAdd;
//                break;
//
//            case "expense":
//                myElement=expense;
//                break;
//
//            case "income":
//                myElement=income;
//                break;
//
//            case "investment":
//                myElement=investment;
//                break;
//
//            case "salary":
//                myElement=salary;
//                break;

        }

        clickFunction(myElement);
    }


    public void findElementAndSendKeysFunction(String ElementName, String value) {

        switch (ElementName) {
            case "searchInputName":
                myElement=searchInputName;
                break;

            case "searchInputCode":
                myElement=searchInputCode;
                break;

            case "countrySearchInput":
                myElement=countrySearchInput;
                break;

//            case "inputCountryName":
//                myElement = inputCountryName;
//                break;
//
//            case "inputCountryCode":
//                myElement = inputCountryCode;
//                break;
//
//            case "nameInput":
//                myElement = nameInput;
//                break;
//
//            case "codeInput":
//                myElement = codeInput;
//                break;
//
//            case "subjectCategoryName":
//                myElement = subjectCategoryName;
//                break;
//
//            case "subjectCategoryCode":
//                myElement = subjectCategoryCode;
//                break;
//
//            case "deleteSearchName":
//                myElement = deleteSearchName;
//                break;
//
//            case "deleteSearchCode":
//                myElement = deleteSearchCode;
//                break;
//
//            case "budgetCodeInput":
//                myElement = budgetCodeInput;
//                break;
//
//            case "budgetNameInput":
//                myElement = budgetNameInput;
//                break;

        }

        sendKeysFunction(myElement, value);
    }
    public void findElementAndVerifyContainsText(String ElementName, String message) {
        switch (ElementName) {
            case "successMessage":
                myElement = successMessage;
                break;

            case "errorMessage":
                myElement = errorMessage;
                break;
        }

        verifyElementContainsText(myElement, message);
    }
}

