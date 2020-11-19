package Steps;

import Utils.AllureHelpers;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.Assert.fail;

public class Steps extends AllureHelpers{

    @Step("Заходим на сайт")
    public void goToSite(){
        open("https://yandex.ru/");
    }

    @Step("Ищем элемент")
    public void checkButton(SelenideElement element){
            if(!element.isDisplayed()){
                fail("Элемент не отображается!");
                AllureHelpers.takeScreenshot();
            }
    }

    @Step("Кликаем на элемент")
    public void clickOnElem(SelenideElement element){
        try {
            element.click();
        } catch (Exception e) {
            e.printStackTrace();
            fail("Клик по элементу не удался");
        }
    }
}
