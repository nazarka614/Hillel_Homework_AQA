package homeWork10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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

    public static void closeChrome() {
        if (driver == null) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
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
        driver.findElement(fieldsWebElement.getInputMobileField()).sendKeys(user.getMobile());
        driver.findElement(fieldsWebElement.getInputSubjectField()).click();
        driver.findElement(fieldsWebElement.getInputSubjectField()).sendKeys(user.getSubject());
        driver.findElement(fieldsWebElement.getInputSubjectField()).sendKeys(Keys.ENTER);
        driver.findElement(fieldsWebElement.getInputAddressField()).sendKeys(user.getAddress());
    }
}
