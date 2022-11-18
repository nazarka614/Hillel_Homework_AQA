package homeWork10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass{
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
        }
    }

    public static void closeChrome() {
        if (driver == null) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
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
        driver.findElement(fieldsWebElement.getInputMobileField()).sendKeys(user.getMobile());
        driver.findElement(fieldsWebElement.getInputAddress()).sendKeys(user.getAddress());


    }
}
