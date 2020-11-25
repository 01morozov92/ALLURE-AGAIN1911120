package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        Configuration.reportsFolder = "target/allure-results";
        Configuration.screenshots = false;
        Configuration.headless = true;
        Configuration.baseUrl = "http://35.228.120.124:8080";
    }
//
//    @AfterMethod
//    public void afterMethod() {
//        AllureHelpers.takeScreenshot();
//    }

}
