package github;

import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomeworkSelenideTests2 {

    @Test
    void githubSolutionsPages() {
        open("https://github.com/");
        $(".header-menu-wrapper").parent().$(byText("Solutions")).hover();
        $(byText("Enterprise")).click();
        $(".enterprise-hero").shouldHave(text("GitHub for enterprises"));
    }

    @Test
    void dragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}