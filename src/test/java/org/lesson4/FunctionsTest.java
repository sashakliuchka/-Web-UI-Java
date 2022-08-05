package org.lesson4;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.lesson4.Functions.isPalindrome;

public class FunctionsTest {
    private static Logger logger = LoggerFactory.getLogger("FunctionsTest");

    @BeforeAll
    static void beforeAll() {
        logger.info("Метод выполняется 1 раз перед всеми тестами класса");
        //System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
    }

    //TRACE, DEBUG, INFO, WARN, ERROR
    @BeforeEach
    void beforeEach() {
        //WebDriver driver = new ChromeDriver();
        logger.error("Метод выполнится перед каждым тестом класса");
    }

    @Test
    @DisplayName("Метод проверки палиндрома с нечетным количеством символов")
    void givenPalindromeWhenCallIsPalindromeMethodThenTrue() {
        assertThat(isPalindrome("1234321")).isTrue();
        //Assertions.assertEquals(true, result);
    }

    @Test
    @Disabled("broken")
    @DisplayName("Метод проверки палиндрома с четным количеством символов")
    void palindromeTest() {
        boolean result = isPalindrome("123321");
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @Tag("smoke") //mvn test -D groups=smoke
    @ValueSource(strings = {"123321", "1235321"})
    void isPalindromeTestWithDataProvider(String word) {
        boolean result = isPalindrome(word);
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @CsvSource({"123, false", "123321, true"})
    void csvTest(String word, boolean expectedResult) {
        boolean actualResult = isPalindrome(word);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("catAndAgeDataProvider")
    void catEqualAgeTest(Cat cat, Integer age) {
        Assertions.assertEquals(cat.getAge(), age);
    }

    private static Stream<Arguments> catAndAgeDataProvider() {
        return Stream.of(
                Arguments.of(new Cat("Test1", 10), 10),
                Arguments.of(new Cat("Test2", 11), 11),
                Arguments.of(new Cat("Test2", 12), 12)
        );
    }

    @AfterEach
    void afterEach() {
        //driver.quit();
        System.out.println("Метод выполнится 1 раз после каждого теста");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Метод выполнится 1 раз после всех тестов класса");
    }
}
