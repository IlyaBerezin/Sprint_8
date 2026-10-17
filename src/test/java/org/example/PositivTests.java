package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PositivTests {
    @Test
    @DisplayName("Проверка с 3-мя символами")
    public void checkNameWithThreeSimbols() {
        String name = "Б И";
        assertEquals(true, new Account(name).checkNameToEmboss(), "Имя " + name + " можно печатать на карте");
    }

    @Test
    @DisplayName("Проверка с 4-мя символами")
    public void checkNameWithFourSimbols() {
        String name = "Б Ил";
        assertEquals(true,  new Account(name).checkNameToEmboss(),"Имя " + name + " можно печатать на карте");
    }

    @Test
    @DisplayName("Проверка с 19-ю символами")
    public void checkNameWithNinteenSimbols() {
        String name = "Березин ИльяИльяИль";
        assertEquals(true,  new Account(name).checkNameToEmboss(),"Имя " + name + " можно печатать на карте");
    }

    @Test
    @DisplayName("Проверка с 19-ю символами")
    public void checkNameWithEighteenSimbols() {
        String name = "Березин ИльяИльяИль";
        assertEquals(true,  new Account(name).checkNameToEmboss(),"Имя " + name + " можно печатать на карте");
    }
}
