package jpk.main;

import java.util.TreeMap;

public class FromArabicToRomanNumber {

   private static TreeMap<Integer, String> map = new TreeMap<>();

    static{
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
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
