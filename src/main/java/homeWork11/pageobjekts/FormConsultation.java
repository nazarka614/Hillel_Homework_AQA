package homeWork11.pageobjekts;

import homeWork11.data.Hobbies;
import homeWork11.data.User;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FormConsultation {
    @FindBy(id = "firstName")
    WebElement inputFirstNameField;
    @FindBy(id = "lastName")
    WebElement inputLastNameField;
    @FindBy(id = "userEmail")
    WebElement inputEmailField;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")
    WebElement genderMale;
    @FindBy(xpath = "//*[@id=\"genterWrapper\"]/div[2]/div[2]/label")
    WebElement genderFemale;
    @FindBy(id = "userNumber")
    WebElement inputMobileField;
    @FindBy(id = "subjectsInput")
    WebElement inputSubjectField;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    WebElement hobbiesSport;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[2]/label")
    WebElement hobbiesReading;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label")
    WebElement hobbiesMusic;
    @FindBy(id = "currentAddress")
    WebElement inputAddressField;
    @FindBy(xpath = "//div[contains(@class, 'subjects-auto-complete__option--is-focused')]")
    WebElement FocusSUB;

    public void completeForm(User user) {
        this.inputFirstNameField.sendKeys(user.getFirstname());
        this.inputLastNameField.sendKeys(user.getLastname());
        this.inputEmailField.sendKeys(user.getEmail());
        if (user.isMale()) {
            this.genderMale.click();
        } else if (user.isFemale()) {
            this.genderFemale.click();
        }
        this.inputMobileField.sendKeys(user.getMobile());
        this.inputSubjectField.sendKeys("E");
        int i = 0;
        while (i<=7){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
            if (this.FocusSUB.getText().equals("Economics")){
                this.inputSubjectField.sendKeys(Keys.ENTER);
                break;
            }else {
                this.inputSubjectField.sendKeys(Keys.DOWN);
            }
        }
        if (user.getHobbies() == Hobbies.Sports) {
            this.hobbiesSport.click();
        } else if (user.getHobbies() == Hobbies.Reading) {
            this.hobbiesReading.click();
        } else if (user.getHobbies() == Hobbies.Music) {
            this.hobbiesMusic.click();
        }
        this.inputAddressField.sendKeys(user.getAddress());
    }
}