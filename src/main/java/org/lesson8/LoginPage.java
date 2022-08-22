package org.lesson8;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    private SelenideElement emailField = $(By.id("email"));

    private SelenideElement passwordField = $(By.id("passwd"));

    private SelenideElement signInButton = $(By.id("SubmitLogin"));

    @Step("Логин")
    public MainPage login(String login, String password) {
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        return page(MainPage.class);
    }
}
