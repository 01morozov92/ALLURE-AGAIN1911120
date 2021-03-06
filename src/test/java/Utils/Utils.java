package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "var/jenkins_home/chromedriver");
        Configuration.reportsFolder = "target/allure-results";
        Configuration.screenshots = false;
        Configuration.headless = true;
    }

    @AfterMethod
    public void afterMethod() {
        AllureHelpers.takeScreenshot();
    }

}
