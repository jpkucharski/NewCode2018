package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramableTest {
    private static final String SIMPLE_STRING_1 = "String 1";
    private static final String SIMPLE_STRING_2 = "1 String";
    private static final String SIMPLE_STRING_3 = "String 2";

    private Anagramable anagramable;

    @Before
    public void setUp() {
        anagramable = new Anagram();
    }

    @Test
    public void puttingTwoStrings_shouldReturnInstanceOfBoolean() {
        Boolean actual = anagramable.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_2);
        assertTrue(actual instanceof Boolean);
    }

    @Test
    public void puttingTwoDifferentStrings_shouldReturnFalse() {
        Boolean actual = anagramable.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_3);
        assertFalse(actual);
    }

    @Test
    public void puttingTwoAnagramsStrings_shouldReturnTrue() {
        Boolean actual = anagramable.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_2);
        assertTrue(actual);
    }

}