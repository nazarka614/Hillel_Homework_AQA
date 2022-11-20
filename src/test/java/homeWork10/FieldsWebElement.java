package homeWork10;

import org.openqa.selenium.By;

public class FieldsWebElement {
    By inputFirstNameField;
    By inputLastNameField;
    By inputEmailField;
    By genderMale;
    By genderFemale;
    By inputMobileField;
    By inputSubjectField;
    By inputAddressField;
    By hobbiesSport;
    By hobbiesReading;
    By hobbiesMusic;


    public FieldsWebElement() {
        this.inputFirstNameField = By.xpath("//*[@id=\"firstName\"]");
        this.inputLastNameField = By.id("lastName");
        this.inputEmailField = By.id("userEmail");
        this.genderMale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label");
        this.genderFemale = By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label");
        this.inputMobileField = By.id("userNumber");
        this.inputSubjectField = By.id("subjectsInput");
        this.hobbiesSport = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label");
        this.hobbiesReading = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label");
        this.hobbiesMusic = By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label");
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

    public By getGenderMale() {
        return genderMale;
    }

    public By getGenderFemale() {
        return genderFemale;
    }

    public By getInputMobileField() {
        return inputMobileField;
    }

    public By getInputSubjectField() {
        return inputSubjectField;
    }

    public By getHobbiesSport() {
        return hobbiesSport;
    }

    public By getHobbiesReading() {
        return hobbiesReading;
    }

    public By getHobbiesMusic() {
        return hobbiesMusic;
    }

    public By getInputAddressField() {
        return inputAddressField;
    }

}
