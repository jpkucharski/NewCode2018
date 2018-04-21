package com.jpk.main;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class MainTest {

    private Main main;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        main = new com.jpk.main.Main();
    }
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void puttingInteger_shouldReturnException() {
        thrown.expect(MyException.class);
        thrown.expectMessage("Error message!");
        main.add(-5);
    }






}