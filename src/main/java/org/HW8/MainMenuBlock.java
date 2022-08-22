package org.HW8;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainMenuBlock {
    private SelenideElement footballButton = $(By.xpath("//div[@isparent]//a[@href=\"/football/\"]"));

    public FootballSuggestPage MoveFootballButton() {
        footballButton.hover();
        return page(FootballSuggestPage.class);
    }
}
