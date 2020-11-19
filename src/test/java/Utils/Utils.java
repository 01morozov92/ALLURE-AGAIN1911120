package Utils;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.AfterStep;
import org.aspectj.lang.annotation.After;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;


public class Utils {


    @BeforeClass
    public static void beforeClass() {
        Configuration.reportsFolder = "target/allure-results";
        Configuration.screenshots = false;
        Configuration.headless = true;
    }

    @AfterStep
    public void afterMethod() {
        AllureHelpers.takeScreenshot();
    }

}
