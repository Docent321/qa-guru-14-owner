package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebTest {

    @Test
    void testLogotipOzon() {
        open("https://www.ozon.ru/");
        $("[data-widget=header]").should(text("Ozon"));
    }
}
