package com.jpk.main;

import com.jpk.exceptions.NegativeNumberException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {


    private static final int ZERO_INTEGER = 0;
    private static final int FIVE_INTEGER = 5;
    private static final String ZERO_STRING = "0";
    private static final String FIVE_STRING = "5";
    private static final String FIVE_WITH_COMA_STRING = "5,";
    private static final String FIVE_AND_SEVEN = "5,7";
    private static final String FIVE_AND_SEVEN_AND_TWELVE = "5,7,12";
    private static final String FIVE_AND_SEVEN_AND_TWELVE_WITH_NEWLINE = "5\n7,12";
    private static final int TWELVE = 12;
    private static final int TWENTY_FOUR = 24;
    private static final String NEGATIVE_TWO = "-2";
    private static final String STRING_VALIDATION_ERROR_MESSAGE = "The result is an negative number!!";

    private Calculator calculator;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();


    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Before
    public void setUp() {
        calculator = new Calculator();

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
    public void sending0StringIntoAddMethod_ShouldReturn0Int() {
        int actual = calculator.add(ZERO_STRING);
        int expected = ZERO_INTEGER;
        assertEquals(expected, actual);
    }

    @Test
    public void sending5StringIntoAddMethod_ShouldReturn5Int() {
        int actual = calculator.add(FIVE_STRING);
        int expected = FIVE_INTEGER;
        assertEquals(expected, actual);
    }

    @Test
    public void sendingFiveWithComaStringIntoAddMethod_ShouldReturn5Int() {
        int actual = calculator.add(FIVE_WITH_COMA_STRING);
        int expected = FIVE_INTEGER;
        assertEquals(expected, actual);
    }

    @Test
    public void sendingInOneString5And7SeparatedByComaIntoAddMethod_ShouldReturn12Int() {
        int actual = calculator.add(FIVE_AND_SEVEN);
        int expected = TWELVE;
        assertEquals(expected, actual);
    }

    @Test
    public void sendingInOneString5And7and12SeparatedByComaIntoAddMethod_ShouldReturn24Int() {
        int actual = calculator.add(FIVE_AND_SEVEN_AND_TWELVE);
        int expected = TWENTY_FOUR;
        assertEquals(expected, actual);
    }

    @Test
    public void sendingInOneString5And7and12SeparatedByComaAnsNewLineSymbolIntoAddMethod_ShouldReturn24Int() {
        int actual = calculator.add(FIVE_AND_SEVEN_AND_TWELVE_WITH_NEWLINE);
        int expected = TWENTY_FOUR;
        assertEquals(expected, actual);
    }

    @Test
    public void testValidationExceptionMessage_ShouldThrowExceptionWithSpecificMessage() {
        thrown.expect(NegativeNumberException.class);
        thrown.expectMessage(STRING_VALIDATION_ERROR_MESSAGE);
        calculator.add(NEGATIVE_TWO);

    }


}