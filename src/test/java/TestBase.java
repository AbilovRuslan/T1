

import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import pages.MainPage;

import static com.codeborne.selenide.Configuration.baseUrl;


public class TestBase {
    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://t1.ru/";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 10000;
        Configuration.pageLoadStrategy = "eager";
    }
}


