package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeworkSelenideTests {

    @Test
    void githubSearchPages() {
        open("https://github.com/selenide/selenide/wiki");
        $("#wiki-body").$(byText("Soft assertions")).click();
        $("#user-content-3-using-junit5-extend-test-class").parent()
                .shouldHave(text("Using JUn,it5 extend test class"));
    }

    @Test
    void divExample() {
        open("file:///C:/Users/Lisa/Desktop/h1%20div.html");
        $("h1 div").click(); //тест пройдет
//        $("h1").$("div").click(); // тест упадет
    }
}
