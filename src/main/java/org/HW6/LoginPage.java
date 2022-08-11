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

    private final String emailIdLocator = "email";

    @FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[2]/div/div[1]/div/form/div[2]/label/input")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name=\"password\"][@placeholder=\"Ваш пароль\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type=\"submit\"][@data-event-category=\"user\"][@data-event-name=\"auth/success\"]")
    private WebElement signInButton;

    public MainPage login(String login, String password) {
        webDriverWait.until(ExpectedConditions.visibilityOf(emailField));
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(emailIdLocator)));
        emailField.sendKeys(login);
        passwordField.sendKeys(password);
        signInButton.click();
        return new MainPage(driver);
    }
}
