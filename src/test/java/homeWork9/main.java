package homeWork9;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    static WebDriver driver = new ChromeDriver();
    public static void main(String[] args) {
        firstTest();

    }
    public static void firstTest(){
        driver.manage().window().maximize();
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
