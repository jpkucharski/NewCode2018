package com.jpk.interfaces;


import com.jpk.exceptions.ValidationException;
import com.jpk.main.Main;
import com.jpk.main.Validator;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class ValidatorTest
{
    private static final String VALID_STRING = "ABCD";
    private static final String INVALID_STRING = "ABCDE";
    private static final String FILE_PATH = "c:/NewFolder/xxf.txt";
    private String ERROR_MESSAGE = "Error Message";

//    private static final Object PRINT_OUT_STRING_RESPONCE = "Message is Valid";

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    private Validator validator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Before
    public void setUpStreams()
    {
        System.setOut( new PrintStream( outContent ) );
    }


    @Before
    public void setUp()
    {
        validator = new Validator();
    }


    @After
    public void cleanUpStreams()
    {
        System.setOut( null );
    }


    @Test( expected = ValidationException.class )
    public void testValidationMethod_ShouldReturnExceptionIfStringIsNotValid()
    {
       assertFalse( validator.validation( INVALID_STRING ));
    }

    @Test
    public void testValidationMethod_ShouldReturnTrue(){
        assertTrue(validator.validation(VALID_STRING));
    }


//    @Test
//    public void testValidationExceptionMessage_ShouldThrowExceptionWithSpecyficMessage() throws ValidationException
//    {
//        thrown.expect( ValidationException.class );
//        thrown.expectMessage( ERROR_MESSAGE );
//        validator.validation( INVALID_STRING );
//        thrown.expectMessage(JUnitMatchers.containsString(ERROR_MESSAGE));
//    }

    @Test(expected = ValidationException.class)
    public void testGettingFileMethod_ShouldReturnFileNotFoundException() throws FileNotFoundException {
        Main m = new Main();
        m.getFile(FILE_PATH);
//        File expected = new File("c:/NewFolder/xxx.txt");
//        assertEquals(expected,validator.getingFile(FILE_PATH) );
    }

    @Test
    public void testValidationExceptionMessage_ShouldThrowExceptionWithSpecyficMessage() throws ValidationException, FileNotFoundException {
        thrown.expect( ValidationException.class );
        thrown.expectMessage( ERROR_MESSAGE );
        validator.gettingFile(FILE_PATH);
        thrown.expectMessage(JUnitMatchers.containsString(ERROR_MESSAGE));
    }



}