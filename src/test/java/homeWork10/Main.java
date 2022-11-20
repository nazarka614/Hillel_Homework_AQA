package homeWork10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Main extends BaseClass{
    public static void main(String[] args) throws InterruptedException {
        BaseClass.createDriver();
        String string = "https://demoqa.com/automation-practice-form";
        BaseClass.setURL(string);
        BaseClass.FillDataInFields();
    }
}
