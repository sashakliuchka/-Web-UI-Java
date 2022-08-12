package org.HW6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.lesson6.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * @Author Александр Ключка
 * @created 2022-08-11  01:38
 **/

public class PageObjectTestSportsRu {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.sports.ru/");
    }

    @Test
    void LoginTest() throws InterruptedException {
        // MainPage mainPage = new MainPage(driver);
        // mainPage.clickSingInButton();
        // new LoginPage(driver).login("spartalex93@test.test", "123456");
        // new MainMenuBlock(driver).hoverWomenButton();
        // new WomenSuggestPage(driver).

        //new MainPage(driver).clickSingInButton();

        new MainPage(driver).clickSingInButton()
                .login("fodehi2154@aregods.com", "1234567890");


    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
