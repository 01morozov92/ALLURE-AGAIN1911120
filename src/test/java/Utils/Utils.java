package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        Configuration.reportsFolder = "target/allure-results";
        Configuration.screenshots = false;
        Configuration.holdBrowserOpen = true;
        Configuration.browserBinary = "/usr/bin/google-chrome";
        Configuration.headless = true;
    }
//
//    @AfterMethod
//    public void afterMethod() {
//        AllureHelpers.takeScreenshot();
//    }

}
