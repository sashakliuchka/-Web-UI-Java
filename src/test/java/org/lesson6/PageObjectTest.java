package org.lesson6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTest {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
    }

    @Test
    void putTShirtToCartTest() throws InterruptedException {
        // MainPage mainPage = new MainPage(driver);
        // mainPage.clickSingInButton();
        // new LoginPage(driver).login("spartalex93@test.test", "123456");
        // new MainMenuBlock(driver).hoverWomenButton();
        // new WomenSuggestPage(driver).

        //new MainPage(driver).clickSingInButton();

        new MainPage(driver).clickSingInButton()
                .login("spartalex93@test.test", "123456")
                .mainMenuBlock.hoverWomenButton()
                .clickTShirtsButton()
                .selectSize("S")
                .moveMouseToProductAndAddToCart()
                .checkTotalSumma("$18.51");
    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
