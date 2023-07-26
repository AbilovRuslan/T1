package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    SelenideElement
            headerLinks = $("b-menu-header__link");
    public MainPage checkHeaderLinks(){
        headerLinks.shouldHave(text("Холдинг"))
                .shouldHave(text("Решения"))
                .shouldHave(text("Продукты"))
                .shouldHave(text("Центры компетенций"))
                .shouldHave(text("Проекты"))
                .shouldHave(text("Мероприятия"))
                .shouldHave(text("Карьера"))
                .shouldHave(text("Пресс-центр"));

        return this;

    }

         public MainPage clickAboutButton() {
         headerLinks.$(byText("Холдинг")).click();

        return this;
        }
//
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Решения")).click();
//
//        return this;
//    }
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Продукты")).click();
//
//        return this;
//    }
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Центр компетенции")).click();
//
//        return this;
//    }
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Проекты")).click();
//
//        return this;
//    }
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Мероприятия")).click();
//
//        return this;
//    }
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Карьера")).click();
//
//        return this;
//    }
//    public MainPage clickAboutButton() {
//        headerLinks.$(byText("Пресс-центр")).click();
//
//        return this;
//    }
//
}
