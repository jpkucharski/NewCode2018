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
    public Boolean isAnagram(String string1, String string2) {
        this.string1 = string1.replaceAll(" ", "");
        this.string2 = string2.replaceAll(" ", "");
        return true;
    }

}