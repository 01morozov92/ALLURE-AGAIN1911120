package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        Configuration.reportsFolder = "target/allure-results";
        Configuration.browserBinary = "/usr/bin/google-chrome";
        Configuration.screenshots = false;
        Configuration.holdBrowserOpen = true;
        Configuration.headless = true;
    }
//
//    @AfterMethod
//    public void afterMethod() {
//        AllureHelpers.takeScreenshot();
//    }

}
