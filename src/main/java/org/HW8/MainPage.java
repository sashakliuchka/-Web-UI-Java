package org.HW8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage  {
    private SelenideElement signInButton = $(By.xpath("//a[@href=\"/logon.html\"]"));

    public MainMenuBlock mainMenuBlock;

    @Step("Клик на кнопку логина")
    public LoginPage clickSingInButton() {
        signInButton.click();
        return page(LoginPage.class);
    }
}
