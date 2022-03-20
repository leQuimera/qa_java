package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.internal.matchers.Equality;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline feline;

    LionAlex lionAlex = new LionAlex(feline);


    public LionAlexTest() throws Exception {
    }

    //Checking all friends
    @Test
    public void validateGetFriends() {
        List <String> expected = List.of("Марти", "Глория", "Мелман");
        List <String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);
    }

    //Checking place to live
    @Test
    public void validationGetPlaceOfLiving() {
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }

    //Checking the number of kitten
    @Test
    public void validateGetKittens() {
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }

}
