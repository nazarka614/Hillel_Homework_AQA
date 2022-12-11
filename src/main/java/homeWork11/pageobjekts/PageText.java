package homeWork11.pageobjekts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class PageText {
    @FindBy(xpath = "//*[contains(@class, 'course-rating_average')]")
    WebElement rate;

    @FindBy(xpath = "//*[contains(@class, 'introduction-info_content introduction-info-redactor')]/p")
    WebElement description;

    @FindBy(xpath = "//*[contains(@class, 'introduction-info-redactor_section')]")
    List<WebElement> goals;

    public String getCourseTitle(WebDriver driver) {
        System.out.println(driver.getTitle());
        return driver.getTitle();
    }

    public String getCourseRate() {
        System.out.println(this.rate.getText());
        return this.rate.getText();
    }

    public String getCourseDescription() {
        System.out.println(this.description.getText());
        return this.description.getText();
    }

    public String getCourseGoals() {
        for (WebElement l: goals){
            System.out.println(l.getText());
        }
        return goals.toString();
    }
}
