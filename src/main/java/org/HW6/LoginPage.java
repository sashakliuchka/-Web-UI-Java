package org.HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final String emailXpathLocator = "//div[@class='auth_form-row']//input[@class='authlogin-input auth_login-input_email input input_size_extra-large']";
    @FindBy(xpath = emailXpathLocator)
    private WebElement emailField;

    @FindBy(xpath = "//input[@name=\"password\"][@placeholder=\"Ваш пароль\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type=\"submit\"][@data-event-category=\"user\"][@data-event-name=\"auth/success\"]")
    private WebElement signInButton;

    public MainPage login(String login, String password) {
        //webDriverWait.until(ExpectedConditions.visibilityOf(emailField));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(emailXpathLocator)));
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        return new MainPage(driver);
    }
}
