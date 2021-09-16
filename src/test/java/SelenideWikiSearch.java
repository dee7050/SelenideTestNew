import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;

public class SelenideWikiSearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.startMaximized = true;
    }
    @Test
    void shouldFindSelenideSoftAssertionsPage() {
        // открыть страничку гитхаб селенид
      open("https://github.com/selenide/selenide");

      // кликнуть на вики
        $("#wiki-tab").click();

        // проверка страницы SoftAssertions
        $("#wiki-pages-filter").setValue("SoftAssertions");

        //открываем страницу SoftAssertions
        $$("#wiki-pages-box ul li").find(text("SoftAssertions")).click();

        //проверка кода для JUnit5
        $("#wiki-body").shouldHave(text("JUnit5"),text("@ExtendWith({SoftAssertsExtension.class})"));



    }
}
