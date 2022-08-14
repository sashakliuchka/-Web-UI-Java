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

    private final String emailXpathLocator = "//div[@class='auth__form-row']//input[@class='auth__login-input auth__login-input_email input input_size_extra-large']";

    @FindBy(xpath = emailXpathLocator)
    private WebElement emailField;

    @FindBy(xpath = "//div[@class='auth__form-row']//input[@class='auth__login-input input input_size_extra-large']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@data-event-name='auth/success']")
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