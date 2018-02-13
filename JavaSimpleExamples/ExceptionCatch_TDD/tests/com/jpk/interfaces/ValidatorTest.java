package com.jpk.interfaces;


import com.jpk.exceptions.ValidationException;
import com.jpk.main.Validator;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidatorTest {
    private static final String VALID_STRING = "ABCD";
    private static final String INVALID_STRING = "ABCDE";
    private static final String FILE_PATH = "c:\\NewFolder\\xxf.txt";
    private static final String STRING_VALIDATION_ERROR_MESSAGE = "String length is not equal to 4";
    private static final String FILE_NOT_FOUND_ERROR_MESSAGE =
            "c:\\NewFolder\\xxf.txt (The system cannot find the file specified)";


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private Validator validator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


    @Before
    public void setUp() {
        validator = new Validator();
    }


    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test(expected = ValidationException.class)
    public void testValidationMethod_ShouldReturnExceptionIfStringIsNotValid() {
        assertFalse(validator.validation(INVALID_STRING));
    }

    @Test
    public void testValidationMethod_ShouldReturnTrue() {
        assertTrue(validator.validation(VALID_STRING));
    }


    @Test
    public void testValidationExceptionMessage_ShouldThrowExceptionWithSpecificMessage() {
        thrown.expect(ValidationException.class);
        thrown.expectMessage(STRING_VALIDATION_ERROR_MESSAGE);
        validator.validation(INVALID_STRING);
    }


    @Test
    public void testGetFileMessage_ShouldThrowExceptionWithSpecificMessage() {
        thrown.expect(ValidationException.class);
        thrown.expectMessage(FILE_NOT_FOUND_ERROR_MESSAGE);
        validator.gettingFile(FILE_PATH);
    }
}