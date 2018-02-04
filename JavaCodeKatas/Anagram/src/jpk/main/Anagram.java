package jpk.main;

public class Anagram implements Anagramable {

    private String string1;
    private String string2;

    public String getString1() {
        return string1;
    }

    public String getString2() {
        return string2;
    }

    @Override
    public Boolean isAnagram(String s1, String s2) {
        string1 = s1.replaceAll(" ", "");
        string2 = s2.replaceAll(" ", "");
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        return true;
    }

}