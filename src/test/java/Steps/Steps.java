package Steps;
import Utils.AllureHelpers;
import Utils.Utils;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.fail;

public class Steps extends AllureHelpers{

    @Step("Заходим на сайт")
    public void goToSite(){
        open("https://yandex.ru/");
    }

    @Step("Ищем элемент")
    public void checkButton(SelenideElement element){
        try {
            Thread.sleep(2000);
            element.isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Элемент не найден");
            takeScreenshot();
        }
    }

    @Step("Кликаем на элемент")
    public void clickOnElem(SelenideElement element){
        try {
            Thread.sleep(2000);
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Клик по элементу не удался");
        }
    }
}
