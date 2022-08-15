package org.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TransfersPage extends BasePage {
    public TransfersPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"branding-layout\"]/div/div[2]/div[2]/div[2]/div/div[1]")
    private WebElement top5for24hourTab;

    @FindBy(xpath = "//*[@id=\"branding-layout\"]/div/div[2]/div[2]/div[2]/div/div[1]/a[2]")
    private WebElement topFor7daysTab;

    @FindBy(xpath = "//*[@id=\"branding-layout\"]/div/div[2]/div[2]/div[2]/div/div[1]/a[3]")
    private WebElement topFor90daysTab;

    public TransfersPage ShowTop7transfer () {
        topFor7daysTab.click();
        return new TransfersPage(driver);
    }
}
