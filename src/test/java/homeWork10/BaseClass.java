package homeWork10;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public static UserInfo user;
    public static FieldsWebElement fieldsWebElement;

    public static void createFieldsWebElement() {
        if (fieldsWebElement == null) {
            fieldsWebElement = new FieldsWebElement();
        }
    }

    public static void createUser() {
        if (user == null) {
            user = new UserInfo();
        }
    }

    public static void createDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
    }

    public static void setURL(String string) {
        driver.get(string);
    }


    public static void FillDataInFields() {
        createFieldsWebElement();
        createUser();
        driver.findElement(fieldsWebElement.getInputFirstNameField()).sendKeys(user.getFirstname());
        driver.findElement(fieldsWebElement.getInputLastNameField()).sendKeys(user.getLastname());
        driver.findElement(fieldsWebElement.getInputEmailField()).sendKeys(user.getEmail());
        if (user.isMale()) {
            driver.findElement(fieldsWebElement.getGenderMale()).click();
        } else if (user.isFemale()) {
            driver.findElement(fieldsWebElement.getGenderFemale()).click();
        }
        driver.findElement(fieldsWebElement.getInputMobileField()).sendKeys(user.getMobile());
        driver.findElement(fieldsWebElement.getInputSubjectField()).click();
        driver.findElement(fieldsWebElement.getInputSubjectField()).sendKeys(user.getSubject());
        driver.findElement(fieldsWebElement.getInputSubjectField()).sendKeys(Keys.ENTER);
        if (user.getHobbies() == Hobbies.Sports) {
            driver.findElement(fieldsWebElement.getHobbiesSport()).click();
        } else if (user.getHobbies() == Hobbies.Reading) {
            driver.findElement(fieldsWebElement.getHobbiesReading()).click();
        } else if (user.getHobbies() == Hobbies.Music) {
            driver.findElement(fieldsWebElement.getHobbiesMusic()).click();
        }
        driver.findElement(fieldsWebElement.getInputAddressField()).sendKeys(user.getAddress());
    }
}
