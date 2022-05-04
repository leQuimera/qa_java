package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AnimalTestParam {
    private final String animalType;
    private final List<String> permissibleFood;

    Animal animal = new Animal();

    public AnimalTestParam(String animalType, List<String> permissibleFood) {
        this.animalType = animalType;
        this.permissibleFood = permissibleFood;
    }

    @Parameterized.Parameters
    public static Object[][] setFoodForAnimal() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    // Positive herbivore
    // Positive predator
    @Test
    public void validateGetFoodPositiveValue() throws Exception{
        List <String> actualListOfFood = animal.getFood(animalType);
        assertEquals(permissibleFood, actualListOfFood);
    }

}
