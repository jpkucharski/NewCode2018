package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FromArabicToRomanNumberTest {

    private static final int INTEGER_ONE = 1;
    private static final String STRING_ONE = "I";

    private FromArabicToRomanNumber fromArabicToRomanNumber;

    @Before
    public void setUp() throws Exception {
        fromArabicToRomanNumber = new FromArabicToRomanNumber();
    }

    @Test
    public void puttingInteger_shouldReturnInstanceOfString(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_ONE);
        assertTrue(actual instanceof String);
    }

    @Test
    public void puttingInteger1_shouldReturnStringI(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_ONE);
        String expected = STRING_ONE;
        assertEquals(expected, actual);
    }

}