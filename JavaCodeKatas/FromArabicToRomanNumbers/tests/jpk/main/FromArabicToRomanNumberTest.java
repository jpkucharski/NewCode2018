package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FromArabicToRomanNumberTest {

    private static final int INTEGER_ONE = 1;
    private static final int INTEGER_TWO = 2;
    private static final int INTEGER_THREE = 3;
    private static final String STRING_ONE = "I";
    private static final String STRING_TWO = "II";
    private static final String STRING_THREE = "III";
    private static final int INTEGER_FOUR = 4;
    private static final String STRING_FOUR = "IV";
    private static final int INTEGER_FIVE = 5;
    private static final String STRING_FIVE = "V";
    private static final int INTEGER_NINE = 9;
    private static final String STRING_NINE = "IX";
    private static final int INTEGER_TEN = 10;
    private static final String STRING_TEN = "X";

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

    @Test
    public void puttingInteger2_shouldReturnStringII(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_TWO);
        String expected = STRING_TWO;
        assertEquals(expected, actual);
    }
    @Test
    public void puttingInteger3_shouldReturnStringIII(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_THREE);
        String expected = STRING_THREE;
        assertEquals(expected, actual);
    }
    @Test
    public void puttingInteger4_shouldReturnStringIV(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_FOUR);
        String expected = STRING_FOUR;
        assertEquals(expected, actual);
    }
    @Test
    public void puttingInteger5_shouldReturnStringV(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_FIVE);
        String expected = STRING_FIVE;
        assertEquals(expected, actual);
    }
    @Test
    public void puttingInteger9_shouldReturnStringIX(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_NINE);
        String expected = STRING_NINE;
        assertEquals(expected, actual);
    }
    @Test
    public void puttingInteger10_shouldReturnStringX(){
        String actual = fromArabicToRomanNumber.fromArabicToRoman(INTEGER_TEN);
        String expected = STRING_TEN;
        assertEquals(expected, actual);
    }




}