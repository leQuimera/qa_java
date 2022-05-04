package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTestNoParam {

    Animal animal = new Animal();
    // Test throw exception
    @Test
    public void validateGetFoodWith() {
        try {
            animal.getFood("Всеядное");
            fail("Ожидаемое исключение не было вызвано");
        } catch (Exception expt) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                    expt.getMessage());
        }
    }

    // Valid answer for family
    @Test
    public void validateGetFamilyPositiveValue() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}
