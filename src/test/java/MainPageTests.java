
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


public class MainPageTests extends TestBase {


    @Test
    @Tag("main_page")
    @DisplayName("Check header links")
    void checkLinksText() {
        mainPage.checkHeaderLinks();
    }

//    @Test
//    @Tag("main_page")
//    @DisplayName("Check About page")
//    void checkAboutLink() {
//        mainPage.clickAboutButton();
//        AboutPage.checkDoctorChoicePageOpened();
//    }

}