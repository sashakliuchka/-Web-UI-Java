package org.lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainMenuBlock {
    private SelenideElement womenButton = $(By.xpath("//li//a[@title='Women']"));

    @Step("Навести курсор мыши на кнопку Women")
    public WomenSuggestPage hoverWomenButton() {
        womenButton.hover();
        return page(WomenSuggestPage.class);
    }
}
