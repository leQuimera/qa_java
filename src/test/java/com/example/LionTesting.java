package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTesting {
    @Mock
    Feline feline;

    // Checking male version
    @Test
    public void validateDoesHaveManeForMale() throws Exception {
        Lion lion = new Lion(feline,"Самец");
        boolean actual = lion.doesHaveMane();
        assertTrue(actual);
    }

    // Checking female version
    @Test
    public void validateDoesHaveManeForFemale() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        assertFalse(actual);
    }

    // Checking exception version
    @Test
    public void validateConstructorLionWithSexWhichNotExistShouldThrowExceptionWithCorrectMessage() throws Exception {
        try {
            new Lion(feline, "Другое");
            fail("Ожидаемое исключение не было вызвано");
        } catch (Exception expt) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка",
                    expt.getMessage());
        }
    }

    //Checking number of kittens
    @Test
    public void validateGetKittensLion() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals(expected,actual);
    }

    //Checking meal type
    @Test
    public void validateGetFoodLion() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

}
