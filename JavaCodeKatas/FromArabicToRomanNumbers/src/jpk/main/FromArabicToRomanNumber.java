package jpk.main;

import java.util.TreeMap;

public class FromArabicToRomanNumber {

   private static TreeMap<Integer, String> map = new TreeMap<>();

    static{
        map.put(1,"I");
        map.put(4,"IV");
    }

    public String fromArabicToRoman(int integer) {
        int fk = map.floorKey(integer);
        if(integer == fk){
            return map.get(fk);
        }
        integer = integer - fk;

        return map.get(fk)+fromArabicToRoman(integer);
    }
}
