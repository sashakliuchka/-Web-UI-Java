package org.HW8;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.HW8.MainMenuBlock;
import org.HW8.*;

import static com.codeborne.selenide.Selenide.open;

public class MyStepdefs {
    @Given("^Пользователь зашел на сайт$")
    public void пользовательЗашелНаСайт() {
        Configuration.timeout = 10000;
        open("https://www.sports.ru/");
    }

    @When("^Наводим кнопку мыши на Футбол$")
    public void наводимКнопкуМышиНаФутбол() {
        new MainMenuBlock().MoveFootballButton();
    }

    @And("^Кликаем на кнопку трансферы ")
    public void кликаемНаКнопкуTransfers() {
        new TransfersPage().ShowTop7transfer();
    }

    @When("Пользовать логинится на сайте")
    public void пользоватьЛогинитсяНаСайте() {
        new org.lesson8.MainPage().clickSingInButton();
        new org.lesson8.LoginPage().login("fodehi2154@aregods.com", "1234567890");
    }


    @After(value = "@close")
    public void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
