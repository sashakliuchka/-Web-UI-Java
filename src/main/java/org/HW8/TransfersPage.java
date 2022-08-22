package org.HW8;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.lesson8.SuccessAddToCartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.page;

public class TransfersPage {
    @FindBy(xpath = "//*[@id=\"branding-layout\"]/div/div[2]/div[2]/div[2]/div/div[1]")
    private WebElement top5for24hourTab;

    @FindBy(xpath = "//*[@id=\"branding-layout\"]/div/div[2]/div[2]/div[2]/div/div[1]/a[2]")
    private WebElement topFor7daysTab;

    @FindBy(xpath = "//*[@id=\"branding-layout\"]/div/div[2]/div[2]/div[2]/div/div[1]/a[3]")
    private WebElement topFor90daysTab;

    @Step("кликнуть на топ 7 трансферов")
    public TransfersPage ShowTop7transfer () {
        topFor7daysTab.click();
        return page(TransfersPage.class);
    }

}


