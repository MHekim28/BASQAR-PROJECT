package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {
    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "ms-text-field[formcontrolname='name']>input")
    private WebElement inputName;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement inputCode;

    @FindBy(xpath = "//ms-save-button//button")
    private WebElement saveButton;

    @FindBy(css = "ms-delete-button>button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[text()=' Yes ']")
    private WebElement yesButton;

    @FindBy(xpath = "(//ms-add-button/div/button)[2]")
    private WebElement newCityAddButton;

    @FindBy(xpath = "(//ms-text-field[@formcontrolname='name']/input)[2]")
    private WebElement newCityNameInput;

    @FindBy(css = "ms-text-field[formcontrolname='code']>input")
    private WebElement newCityNameCode;

    @FindBy(xpath = "(//ms-save-button//button)[2]")
    private WebElement newCitySaveButton;

    @FindBy(xpath = "(//span[text()='Country'])[3]")
    private WebElement nameOfCountries;

    @FindAll({@FindBy(css = "span.mat-option-text")})
    private List<WebElement> selectOptions;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement option1;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
    private WebElement option2;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
    private WebElement option3;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
    private WebElement option4;

    @FindBy(xpath = "(//mat-select/div)[3]")
    private WebElement selectSubjectCategory;

    @FindBy(xpath = "(//mat-select/div)[4]")
    private WebElement selectSubjectStyle;

    @FindBy(xpath = "//ms-text-field/input")
    private WebElement inputSalaryName;

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement slryModifDescriptionInput;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement slryModifVariableInput;

    @FindBy(xpath = "(//mat-select//div)[2]")
    private WebElement selectModifierType;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement slryModifPriorityInput;

    @FindBy(xpath = "(//mat-form-field//input)[5]")
    private WebElement slryModifAmountInput;

    @FindBy(xpath = "(//mat-select//div)[6]")
    private WebElement selectValueType;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement bankAccountNameInput;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement bankAccountIBANInput;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement bankAccountCodeInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='currency']")
    private WebElement bnkAccSelectCurrency;

    @FindBy(xpath = "(//mat-form-field//input)[1]")
    private WebElement costCenterNameInp;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement costCenterCodeInp;

    @FindBy(xpath = "//mat-select[@formcontrolname='type']")
    private WebElement costCenterSelectType;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement costCenterOrderNoInp;

    @FindBy(xpath = "(//mat-form-field//input)[4]")
    private WebElement costCenterSelectCode;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement excelTempNameInput;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement excelTempCountInput;

    @FindBy(xpath = "(//mat-form-field//input)[2]")
    private WebElement excelTempRowInput;

    @FindBy(xpath = "(//mat-form-field//input)[3]")
    private WebElement excelTempColumnInput;

    @FindBy(xpath = "//span[text()='Add Version']")
    private WebElement addVersionButton;

    @FindBy(xpath = "(//mat-toolbar//button)[6]")
    private WebElement excelDialogCloseBtn;

    @FindBy(xpath = "(//div[@role='tab'])[2]")
    private WebElement tabVersionBtn;

    public void findElementAndClickFunction(String elementName) {

        switch (elementName) {


            case "saveButton":
                myElement = saveButton;
                break;

            case "deleteButton":
                myElement = deleteButton;
                break;

            case "yesButton":
                myElement = yesButton;
                break;

            case "newCityAddButton":
                myElement = newCityAddButton;
                break;

            case "newCitySaveButton":
                myElement = newCitySaveButton;
                break;

            case "nameOfCountries":
                myElement=nameOfCountries;
                break;

            case "option1":
                myElement=option1;
                break;

            case "option2":
                myElement=option2;
                break;

            case "option3":
                myElement=option3;
                break;

            case "option4":
                myElement=option4;
                break;

            case "selectSubjectCategory":
                myElement=selectSubjectCategory;
                break;

            case "selectSubjectStyle":
                myElement=selectSubjectStyle;
                break;

            case "selectModifierType":
                myElement=selectModifierType;
                break;

            case "selectValueType":
                myElement=selectValueType;
                break;

            case "bnkAccSelectCurrency":
                myElement=bnkAccSelectCurrency;
                break;

            case "costCenterSelectCode":
                myElement=costCenterSelectCode;
                break;

            case "costCenterSelectType":
                myElement=costCenterSelectType;
                break;

            case "addVersionButton":
                myElement=addVersionButton;
                break;

            case "excelDialogCloseBtn":
                myElement=excelDialogCloseBtn;
                break;

            case "tabVersionBtn":
                myElement=tabVersionBtn;
                break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String elementName, String value) {

        switch (elementName) {

            case "inputName":
                myElement = inputName;
                break;

            case "inputCode":
                myElement = inputCode;
                break;

            case "newCityNameInput":
                myElement = newCityNameInput;
                break;

            case "newCityNameCode":
                myElement = newCityNameCode;
                break;

            case "inputSalaryName":
                myElement=inputSalaryName;
                break;

            case "slryModifDescriptionInput":
                myElement=slryModifDescriptionInput;
                break;

            case "slryModifVariableInput":
                myElement=slryModifVariableInput;
                break;

            case "slryModifPriorityInput":
                myElement=slryModifPriorityInput;
                break;

            case "slryModifAmountInput":
                myElement=slryModifAmountInput;
                break;

            case "bankAccountNameInput":
                myElement=bankAccountNameInput;
                break;

            case "bankAccountIBANInput":
                myElement=bankAccountIBANInput;
                break;

            case "bankAccountCodeInput":
                myElement=bankAccountCodeInput;
                break;

            case "costCenterNameInp":
                myElement=costCenterNameInp;
                break;

            case "costCenterCodeInp":
                myElement=costCenterCodeInp;
                break;

            case "costCenterOrderNoInp":
                myElement=costCenterOrderNoInp;
                break;

            case "excelTempNameInput":
                myElement=excelTempNameInput;
                break;

            case "excelTempCountInput":
                myElement=excelTempCountInput;
                break;

            case "excelTempRowInput":
                myElement=excelTempRowInput;
                break;

            case "excelTempColumnInput":
                myElement=excelTempColumnInput;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void select(String value) {

        for (WebElement option : selectOptions) {

            if (option.getText().equals(value)) {
                clickFunction(option);
                break;
            }
        }
    }

}
