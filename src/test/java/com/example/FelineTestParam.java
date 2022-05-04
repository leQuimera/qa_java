package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestParam {
    private final int counter;

    public FelineTestParam(int counter) {
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

    // Return itself 0
    // Return itself 1
    // Return itself -1
    @Test
    public void validateGetKittensWithTestDataSet() {
        int actual = feline.getKittens(counter);
        assertEquals(counter, actual);
    }
}
