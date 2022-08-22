package org.HW8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * @Author Александр Ключка
 * @created 2022-08-12  14:28
 **/
public class FootballSuggestPage {
    private SelenideElement TransfersButton = $(By.xpath( "//ul[contains(@class,'link-list')]//a[@title='Трансферы']"));

    @Step("Клик на кнопку TShirts")
    public TransfersPage clickTransfersButton() {
        TransfersButton.click();
        return page(TransfersPage.class);
    }
}
