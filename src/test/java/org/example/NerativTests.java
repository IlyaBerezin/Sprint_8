package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NerativTests {

    @Test
    @DisplayName("Проверка с 2-мя символами")
    public void checkNameWithTwoSimbols() {
        String name = "Би";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет менее 3х символов");
    }

    @Test
    @DisplayName("Проверка с пробелом в начале")
    public void checkNameWithWhiteSpaceInStart() {
        String name = " Березин Илья";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет пробел в начале");
    }

    @Test
    @DisplayName("Проверка с 1 символом")
    public void checkNameWithOneSimbol() {
        String name = "Ф";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет менее 3х символов");
    }
    @Test
    @DisplayName("Проверка с пробелом в конце")
    public void checkNameWithWhiteSpaceToEnd() {
        String name = "Березин Илья ";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет пробел в конце");
    }

    @Test
    @DisplayName("Проверка с 20 символами")
    public void checkNameWithTwentySimbols() {
        String name = "Березин БерезинИльяИ";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет более 19 символов");
    }

    @Test
    @DisplayName("Проверка с 21 символом")
    public void checkNameWithTwentyOneSimbols() {
        String name = "Березин БерезинИльяИл";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет более 19 символов");
    }

    @Test
    @DisplayName("Проверка с 2я пробелами")
    public void checkNameWithTwoWhiteSpace() {
        String name = "Берез ин Илья";
        assertEquals(false, new Account(name).checkNameToEmboss(), "Имя " + name + " имеет более одного пробела");
    }

}
