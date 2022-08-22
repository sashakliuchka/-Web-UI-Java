package org.lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;

public class SuccessAddToCartPage {
    private SelenideElement totalSumma = $(By.xpath("//span[@class='ajax_block_cart_total']"));

    private SelenideElement iconOk = $(By.xpath("//i[@class='icon-ok']"));

    @Step("Проверить итоговую сумму заказа")
    public SuccessAddToCartPage checkTotalSumma(String expectedSumma) {
        totalSumma.shouldHave(Condition.text(expectedSumma));
        return this;
    }
}
