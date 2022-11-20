package homeWork10;

import org.openqa.selenium.By;

public class FieldsWebElement {
    By inputFirstNameField;
    By inputLastNameField;
    By inputEmailField;
    By inputMobileField;
    By inputSubjectField;
    By inputAddressField;

    public FieldsWebElement() {
        this.inputFirstNameField = By.xpath("//*[@id=\"firstName\"]");
        this.inputLastNameField = By.id("lastName");
        this.inputEmailField = By.id("userEmail");
        this.inputMobileField = By.id("userNumber");
        this.inputSubjectField = By.id("subjectsInput");
        this.inputAddressField = By.id("currentAddress");

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
    public By getInputSubjectField() {
        return inputSubjectField;
    }
    public By getInputAddressField() {
        return inputAddressField;
    }

}
