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
    private List<WebElement> optionCountries;
//
//    @FindBy(xpath = "//ms-add-button[@fontsize='20px']/div/button")
//   private WebElement categoryAddButton;
//
//    @FindBy(xpath = "(//ms-save-button/button)[2]")
//    private WebElement categorySaveButton;


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

//
//            case "categoryAddButton":
//                myElement=categoryAddButton;
//                break;
//
//            case "categorySaveButton":
//                myElement = categorySaveButton;
//                break;


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

        }
        sendKeysFunction(myElement, value);
    }

    public void select(String value) {

        for (WebElement option : optionCountries) {

            if (option.getText().equals(value)) {
                clickFunction(option);
                break;
            }
        }
    }
    public void waitUntilNeed(String elementName) {

        switch (elementName) {
            case "nameOfCountries":
                myElement = nameOfCountries;
                break;


        }

        waitUntilVisible(myElement);
    }
}
