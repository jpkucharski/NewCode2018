package com.jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private static final int INTEGER_ONE =1 ;
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


}