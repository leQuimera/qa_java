package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTestNoParam {

    Feline feline = new Feline();

    // Return Meal for Predator
    @Test
    public void validateEatMeal() throws Exception {
        List <String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals(expected, actual);
    }

    // Return Kitty
    @Test
    public void validateGetFamily() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected,actual);
    }

    // Is-Empty -> Return 1
    @Test
    public void validateGetKittensIfParameterAbsent() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected,actual);
    }

}
