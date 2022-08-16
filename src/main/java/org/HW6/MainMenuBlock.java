package org.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuBlock extends BasePage {
    public MainMenuBlock(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@isparent]//a[@href=\"/football/\"]")
    private WebElement footballButton;

    public FootballSuggestPage footballButton() {
        footballButton.click();
        return new FootballSuggestPage(driver);
    }
}
