package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "/var/jenkins_home/Yqe3OqUV6mq49g");
        Configuration.reportsFolder = "target/allure-results";
        Configuration.screenshots = false;
        Configuration.headless = true;
    }

    @AfterMethod
    public void afterMethod() {
        AllureHelpers.takeScreenshot();
    }

}
