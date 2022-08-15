package org.HW6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
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
    @DisplayName("Страница трансферы ")
    @Test
    void LoginTest() throws InterruptedException {
        final TransfersPage transfersPage = new MainPage(driver).clickSingInButton()

                .login("fodehi2154@aregods.com", "1234567890")
                .mainMenuBlock.footballButton()
                .clickTransfersButton()
                .ShowTop7transfer();


    }

    @AfterEach
    void killBrowser() {
        driver.quit();
    }
}
