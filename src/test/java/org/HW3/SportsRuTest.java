package org.HW3;

/**
 * @Author Александр Ключка
 * @created 2022-08-01  16:27
 **/
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class SportsRuTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.sports.ru/");
        Cookie cookie = new Cookie("sid", "2a97c931f122076b730ca795ee39ac71%3A2%3A%7Bi%3A0%3Bs%3A10%3A%22_identity_%22%3Bi%3A1%3Bs%3A52%3A%22%5B3545507%2C%22E_QJqRaNdBrepyeVN7uNXi5Dz9tjGpfX%22%2C2592000%5D%22%3B%7D");
        driver.manage().addCookie(cookie);
        driver.navigate().refresh();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("/html/body/nav/div[1]/div/div/div[1]/ul/li[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"branding-layout\"]/div/div[3]/aside/section/article/a")).click();
        driver.findElement(By.xpath("//*[@id=\"comments\"]/form/label/textarea")).sendKeys("text1");
        driver.findElement(By.xpath("*[@id=\"comments\"]/form/div[2]/button")).click();

        Thread.sleep(5000);
        driver.quit();
    }
}
