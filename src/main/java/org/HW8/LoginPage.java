package org.HW8;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {

    private final String emailXpathLocator = "//div[@class='auth__form-row']//input[@class='auth__login-input auth__login-input_email input input_size_extra-large']";

    @FindBy(xpath = emailXpathLocator)
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='auth__form-row']//input[@class='auth__login-input input input_size_extra-large']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-event-name='auth/success']")
    private WebElement signInButton;

    @Step("Логин")
    public MainPage login(String login, String password) {
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        return page(MainPage.class);
    }
}