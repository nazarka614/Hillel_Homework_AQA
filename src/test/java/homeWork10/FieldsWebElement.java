package homeWork10;

import org.openqa.selenium.By;

public class FieldsWebElement {
    By inputFirstNameField;
    By inputLastNameField;
    By inputEmailField;
    By inputMobileField;
    By inputAddress;


    public FieldsWebElement(By inputFirstNameField, By inputLastNameField, By inputEmailField, By inputMobileField, By inputAddress) {
        this.inputFirstNameField = inputFirstNameField;
        this.inputLastNameField = inputLastNameField;
        this.inputEmailField = inputEmailField;
        this.inputMobileField = inputMobileField;
        this.inputAddress = inputAddress;
    }

    public FieldsWebElement() {
        this.inputFirstNameField = By.xpath("//*[@id=\"firstName\"]");
        this.inputLastNameField = By.id("lastName");
        this.inputEmailField = By.id("userEmail");
        this.inputMobileField = By.id("userNumber");
        this.inputAddress = By.id("currentAddress");;
    }

    public By getInputFirstNameField() {
        return inputFirstNameField;
    }

    public By getInputLastNameField() {
        return inputLastNameField;
    }

    public By getInputEmailField() {
        return inputEmailField;
    }

    public By getInputMobileField() {
        return inputMobileField;
    }


    public By getInputAddress() {
        return inputAddress;
    }
}
