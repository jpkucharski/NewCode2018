package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FromArabicToRomanNumberTest {

    private static final Object INTEGER_ONE = 1;


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

}