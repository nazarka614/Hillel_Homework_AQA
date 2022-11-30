package homeWork11.tests;

import homeWork11.configuretions.BaseClass;
import homeWork11.data.User;
import homeWork11.pageobjekts.FormConsultation;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class FormTest extends BaseClass {
    static final String mainURL = "https://demoqa.com/automation-practice-form";
    static FormConsultation formConsultation = PageFactory.initElements(driver, FormConsultation.class);

    @Before
    public void before() {
        if (!driver.getCurrentUrl().equals(mainURL)) {
            driver.get("https://demoqa.com/automation-practice-form");
        }
    }

    @Test
    public void formTest() {
        formConsultation.completeForm(new User());
    }
}
