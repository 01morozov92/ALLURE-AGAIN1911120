package Utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.closeWebDriver;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        Configuration.reportsFolder = "target/allure-results";
        Configuration.screenshots = false;
        Configuration.headless = false;
    }

    @AfterMethod
    public void afterMethod() {
        AllureHelpers.takeScreenshot();
    }

}
