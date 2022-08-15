package org.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Author Александр Ключка
 * @created 2022-08-12  14:28
 **/
public class FootballSuggestPage extends BasePage {
    public FootballSuggestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[contains(@class,'link-list')]//a[@title='Трансферы']")
    private WebElement transfersButton;

    public TransfersPage clickTransfersButton() throws InterruptedException {
        Thread.sleep(5000);
        transfersButton.click();
        return new TransfersPage(driver);
    }
}