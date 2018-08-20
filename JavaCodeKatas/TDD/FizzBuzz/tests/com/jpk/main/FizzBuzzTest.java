package com.jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final Integer DIVISIBLE_BY_THREE = 3;
    private static final Integer DIVISIBLE_BY_FIVE = 5;
    private static final Integer DIVISIBLE_BY_THREE_AND_FIVE = 15;
    private static final String FIZZ_BUZZ = "FIZZ_BUZZ";
    FizzBuzz fb;

    @Before
    public void setUp(){
        fb = new FizzBuzz();
    }

    @Test
    public void sendingInteger3inToMethod_shouldReturnFIZZ() {
        String actual = fb.fizzBuzz(DIVISIBLE_BY_THREE);
        String expected = FIZZ;
        assertEquals(expected, actual);
     }

     @Test
    public void sendingInteger5inToMethod_shouldReturnBUZZ(){
        String actual =  fb.fizzBuzz(DIVISIBLE_BY_FIVE);
        String expected = BUZZ;
        assertEquals(expected,actual);
     }

     @Test
    public void sendingInteger15inToMethod_shouldReturnFIZZBUZZ(){
        String actual = fb.fizzBuzz(DIVISIBLE_BY_THREE_AND_FIVE);
        String expected = FIZZ_BUZZ;
        assertEquals(expected,actual);

     }
}