package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    private static final String SIMPLE_STRING_1 = "String 1";
    private static final String SIMPLE_STRING_2 = "1 String";
    private Anagram anagram;


    @Before
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    public void puttingTwoStringsIntoIsAnagramMethod_shouldRemoveSpacesInWords() {
        anagram.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_2);
        assertTrue(isWithoutSpaces(anagram.getString1()));
        assertTrue(isWithoutSpaces(anagram.getString2()));
    }

    private boolean isWithoutSpaces(String string) {
        Boolean withoutSpace = true;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]== ' '){
                withoutSpace = false;
            break;
            }
        }
        return withoutSpace;
    }
}