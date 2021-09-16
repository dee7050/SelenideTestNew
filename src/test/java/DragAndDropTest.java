import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
      void moveCube(){
        //открыть страницу
        open("https://the-internet.herokuapp.com/drag_and_drop");

        // переместить куб
        $("#column-a").dragAndDropTo("#column-b");

        //проверка
        $("#column-b").shouldHave(text("A"));
        $("#column-a").shouldHave(text("B"));
    }
}
