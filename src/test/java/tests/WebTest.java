package tests;

import org.aeonbits.owner.Config;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class WebTest {

    @Test
    void testLogotipOzon() {
        open("https://www.ozon.ru/");
        $("[data-widget=header]").should(text("Ozon"));
    }
}
