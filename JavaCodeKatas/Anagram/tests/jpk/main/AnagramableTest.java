package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramableTest {
    private static final String SIMPLE_STRING_1 =  "String 1" ;
    private static final String SIMPLE_STRING_2 = "1 String";
    private Anagramable anagramable;

    @Before
    public void setUp(){
        anagramable = new Anagram();
    }

    @Test
    public void puttingTwoStrings_shouldReturnInstanceOfBoolean(){
        Boolean actual = anagramable.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_2);
        assertTrue(actual instanceof Boolean);
    }
}