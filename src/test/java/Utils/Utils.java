package Utils;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        ChromeOptions cap = new ChromeOptions();
        cap.addArguments("--no-sandbox");
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
