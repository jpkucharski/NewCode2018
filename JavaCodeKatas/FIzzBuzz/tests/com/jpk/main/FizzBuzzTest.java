package com.jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private static final int INTEGER_ONE =1 ;
    private static final int INTEGER_THREE = 3;
    private static final int INTEGER_FIVE = 5;
    private static final int INTEGER_FIFTEEN = 15;
    private static final String FIZZ= "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final String FIZZ_BUZZ = "FIZZ_BUZZ";
    private static final String ERROR_MESSAGE = "ZERO";
    private static final int ZERO = 0;
    private static final int NEGATIVE_INTEGER_THREE = -3;
    private FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void puttingEanyInteger_shouldReturnString(){
       String actual = fizzBuzz.fizzOrBuzz(INTEGER_ONE);
       assertTrue(actual instanceof String);
    }

    @Test
    public void puttingInteger3_shouldReturnFizz(){
        String actual = fizzBuzz.fizzOrBuzz(INTEGER_THREE);
        String expected = FIZZ;
        assertEquals(expected, actual);
    }

    @Test
    public void puttingInteger5_shouldReturnStringBuzz(){
        String actual = fizzBuzz.fizzOrBuzz(INTEGER_FIVE);
        String expected = BUZZ;
        assertEquals(expected, actual);
    }

    @Test
    public void puttingInteger15_shouldReturnFizzBuzz(){
        String actual = fizzBuzz.fizzOrBuzz(INTEGER_FIFTEEN);
        String expected = FIZZ_BUZZ;
        assertEquals(expected, actual);
    }

    @Test
    public void puttingZero_shouldReturnErrorMessage(){
        String actual = fizzBuzz.fizzOrBuzz(ZERO);
        String expected = ERROR_MESSAGE;
        assertEquals(expected, actual);
    }

    @Test
    public void puttingNegativeInteger3_shouldReturn(){
        String actual = fizzBuzz.fizzOrBuzz(NEGATIVE_INTEGER_THREE);
        String expected = FIZZ;
        assertEquals(expected, actual);
    }
}