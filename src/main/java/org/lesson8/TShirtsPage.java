package org.lesson8;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class TShirtsPage {
    private ElementsCollection sizesList = $$(By.xpath("//span[.='Size']/ancestor::div[@class='layered_filter']//a"));

    @Step("Выбрать размер")
    public TShirtsPage selectSize(String size) {
        sizesList.findBy(Condition.text(size)).click();
        return this;
    }

    private SelenideElement productElement = $(By.xpath("//ul[@class='product_list grid row']/li"));

    private SelenideElement addToCartButton = $(By.xpath("//span[.='Add to cart']"));

    @Step("Навести кнопку мыши на карточку товара")
    public SuccessAddToCartPage moveMouseToProductAndAddToCart() {
        productElement.hover();
        addToCartButton.click();
        return page(SuccessAddToCartPage.class);
    }
}
