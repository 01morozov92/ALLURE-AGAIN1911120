package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
//        Dselenide.remote=http://localhost:5678/wd/hub
        Configuration.screenshots = false;
        Configuration.browser = "firefox";
        Configuration.headless = true;
        Configuration.reportsFolder = "target/allure-results";
    }
//
//    @AfterMethod
//    public void afterMethod() {
//        AllureHelpers.takeScreenshot();
//    }

}
