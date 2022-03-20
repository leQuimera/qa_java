package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTest {

    private final int counter;

    public FelineTest(int counter) {
        this.counter = counter;
    }

    @Parameterized.Parameters
    public static Object[][] setCounter() {
        return new Object[][]{
                {-1},
                {0},
                {1},
        };
    }

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

    // Return itself 0
    // Return itself 1
    // Return itself -1
    @Test
    public void validateGetKittensWithTestDataSet() {
        int actual = feline.getKittens(counter);
        assertEquals(counter, actual);
    }
}
