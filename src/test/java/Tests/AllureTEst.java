package Tests;


import Steps.Steps;
import Utils.Utils;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;

public class AllureTEst extends Utils {

    private SelenideElement button = $(By.xpath("/html/body/div[2]/div[2]/div[3]/div/div[3]/ftgr/div/div/div[2]/div[1]/a/div"));
    private SelenideElement imagesButton = $(By.xpath("/html/body/div[1]/div[2]/div[3]/div/div[2]/div/div/div[2]/a[2]/div[1]"));
    private SelenideElement searchButton = $(By.xpath("/html/body/header/div/div[2]/div[1]/form/div[2]/button/div"));
    Steps steps = new Steps();


    @Description("Вывожу на экран сообщение")
    @Test(alwaysRun = true)
    public void allureTestOne() {
        steps.goToSite();
    }


    @Description("Проверяем элемент на отображение")
    @Test
    public void checkButtonYandexTest() {
        steps.goToSite();
        steps.checkButton(button);
        steps.clickOnElem(imagesButton);
        Selenide.switchTo().window(1);
        steps.checkButton(searchButton);
    }
}
