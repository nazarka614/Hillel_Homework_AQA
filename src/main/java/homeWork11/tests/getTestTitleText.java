package homeWork11.tests;

import homeWork11.configuretions.BaseClass;
import homeWork11.data.User;
import homeWork11.pageobjekts.FormConsultation;
import homeWork11.pageobjekts.PageText;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class getTestTitleText extends BaseClass {
    static PageText pageText = PageFactory.initElements(driver, PageText.class);
    static final String mainURL = "https://ithillel.ua/courses/introduction-kiev";
    @Before
    public void before() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://ithillel.ua/courses/introduction-kiev");
        }
    }
    @Test
    public void getTitltext() {
        pageText.getCourseTitle(driver);
    }
    @Test
    public void getRate(){
        pageText.getCourseRate();
    }
    @Test
    public void getDescription(){
        pageText.getCourseDescription();
    }
    @Test
    public void getGoals(){
        pageText.getCourseGoals();
    }
}
