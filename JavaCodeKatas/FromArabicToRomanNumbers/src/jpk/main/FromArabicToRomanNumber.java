package jpk.main;

import java.util.TreeMap;

public class FromArabicToRomanNumber {

   private static TreeMap<Integer, String> map = new TreeMap<>();

    static{

        map.put(1,"I");
    }

    public String fromArabicToRoman(int integer) {

        return map.get(map.floorKey(integer));

    }
}
