import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideWikiSearch {
    @Test
    void shouldFindSelenideSoftAssertionsPage() {
        // открыть страничку гитхаб
      open("https://github.com");
        // ввести в поле поиска selenide
        // нажать enter
      $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();
      $$(".repo-list li").first().$("a").click();



    }
}
