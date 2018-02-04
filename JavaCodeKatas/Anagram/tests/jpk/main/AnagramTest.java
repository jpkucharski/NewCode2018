package jpk.main;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    private static final String SIMPLE_STRING_1 = "String 1";
    private static final String SIMPLE_STRING_2 = "1 String";
    private static final char[] STRING_ARRAY_1 = {'s','t','r','i','n','g','1'};
    private static final char[] STRING_ARRAY_2 = {'1','s','t','r','i','n','g'};

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

    @Test
    public void puttingTwoStringsIntoIsAnagramMethod_shouldChangeThemInToLoweCases() {
        anagram.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_2);
        assertTrue(isWithoutUpperCaseCharacters(anagram.getString1()));
        assertTrue(isWithoutUpperCaseCharacters(anagram.getString2()));
    }
    @Test
    public void puttingTwStringsIntoIsAnagramMethos_ShouldCreatedTwoLocalArraysFromString(){
        anagram.isAnagram(SIMPLE_STRING_1, SIMPLE_STRING_2);
        char[] actual1 = anagram.getStringArray1();
        char[] expected1 = STRING_ARRAY_1;
        char[] actual2 = anagram.getStringArray2();
        char[] expected2 = STRING_ARRAY_2;
        assertArrayEquals(expected1, actual1);
        assertArrayEquals(expected2, actual2);
    }

    private boolean isWithoutSpaces(String string) {
        Boolean withoutSpace = true;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                withoutSpace = false;
                break;
            }
        }
        return withoutSpace;
    }

    private boolean isWithoutUpperCaseCharacters(String string) {
        Boolean withoutSpace = true;
        char[] charArray = string.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                withoutSpace = false;
                break;
            }
        }
        return withoutSpace;
    }


}