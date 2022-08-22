package org.lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class WomenSuggestPage {
    private SelenideElement tShirtsButton = $(By.xpath("//ul[contains(@class,'submenu')]//a[@title='T-shirts']"));

    @Step("Клик на кнопку TShirts")
    public TShirtsPage clickTShirtsButton() {
        tShirtsButton.click();
        return page(TShirtsPage.class);
    }
}
