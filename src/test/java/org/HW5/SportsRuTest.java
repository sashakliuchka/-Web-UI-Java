package org.HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.junit.jupiter.api.*;

/**
 * @Author Александр Ключка
 * @created 2022-08-07  15:54
 **/
public class SportsRuTest {
        WebDriver driver;
        WebDriverWait webDriverWait;
        Actions actions;

        private final static String Sports_BASE_URL = "https://www.sports.ru/";

        @BeforeAll
        static void registerDriver() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        void setupBrowser() {
            driver = new ChromeDriver();
            webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
            actions = new Actions(driver);
            driver.get(Sports_BASE_URL);
        }
    @Test
    void AuthorizationAndComment() throws InterruptedException {
        Cookie cookie = new Cookie("sid", "2a97c931f122076b730ca795ee39ac71%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3545507%2C%22E_QJqRaNdBrepyeVN7uNXi5Dz9tjGpfX%22%2C2592000%5D%22%3B%7D");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//div[@isparent]//a[@title='Футбол на Sports.ru']")).click();
        driver.findElement(By.xpath("//*[@id=\"branding-layout\"]/div/div[3]/aside/section/article/a")).click();
        driver.findElement(By.xpath("//*[@id=\"comments\"]/form/label/textarea")).sendKeys("text1");
        driver.findElement(By.xpath("*[@id=\"comments\"]/form/div[2]/button")).click();

        Thread.sleep(5000);
        driver.quit();

    }
    @Test
    @DisplayName("выход из аккаунта")
    void logoutTest () {
        actions.moveToElement(driver.findElement(By.xpath("//div[@class=\"profile-dropdown__image-wrapper\"]")))
                .build()
                .perform();
        driver.findElement(By.xpath("//a[@href=\"/logon.html?logout=1&url=/profile/1110688426/\"]")).click();
        Assertions.assertEquals(driver.findElement(By.xpath("//a[@href=\"/logon.html\"]")).isDisplayed(), false);

    }

    @AfterEach
    void quitBrowser() {
        driver.quit();
    }
}

