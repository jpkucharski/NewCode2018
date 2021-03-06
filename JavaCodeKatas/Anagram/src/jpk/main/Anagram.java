package jpk.main;

import java.util.Arrays;

public class Anagram implements Anagramable {

    private String string1;
    private String string2;
    private char[] stringArray1;
    private char[] stringArray2;

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    public char[] getStringArray1() {
        return stringArray1;
    }

    public char[] getStringArray2() {
        return stringArray2;
    }

    @Override
    public Boolean isAnagram(String s1, String s2) {
        string1 = removingSpaces(s1);
        string2 = removingSpaces(s2);
        string1 = settingAllCharactersToLoweCase(string1);
        string2 = settingAllCharactersToLoweCase(string2);
        stringArray1 = changingStringIntoCharacterArray(string1);
        stringArray2 = changingStringIntoCharacterArray(string2);
        sortingArray(stringArray1);
        sortingArray(stringArray2);
        return Arrays.equals(stringArray1, stringArray2);
    }

    private String removingSpaces(String stringWithSpaces) {
        return stringWithSpaces.replaceAll(" ", "");
    }

    private String settingAllCharactersToLoweCase(String differentCasesString) {
        return differentCasesString.toLowerCase();
    }

    private char[] changingStringIntoCharacterArray(String string) {
        return string.toCharArray();
    }

    private char[] sortingArray(char[] array) {
        Arrays.sort(array);
        return array;
    }

}