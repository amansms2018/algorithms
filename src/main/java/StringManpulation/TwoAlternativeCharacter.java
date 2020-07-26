package StringManpulation;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoAlternativeCharacter {

    public static void main(String[] args) {
        String s = "beabeefeab";
//        System.out.println(findLongestAlternativeChar(s));

    }
}
//
//    private static int findLongestAlternativeChar(String s) {
//        Map<Character, Integer> map = new LinkedHashMap<>();
//        int valu;
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                valu = map.get(s.charAt(i));
//                map.put(s.charAt(i), valu + 1);
//            } else
//                map.put(s.charAt(i), 1);
//        }
//
//        int max1 = map.get(s.charAt(0));
//        int max2 = map.get(s.charAt(0));
//        Character c1 = s.charAt(0);
//        Character c2 = s.charAt(0);
//
//        for (Map.Entry e : map.entrySet()) {
//            if (max2 > (int) e.getValue()) {
//                max2 = (int) e.getValue();
//                c2 =(Character)e.getKey();
//            }
//
//
//
//
//        }
//    }
