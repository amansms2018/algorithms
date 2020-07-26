package InfoSys;

// infoSys=====>infosy
//Amanuel====>manuel
//ANAND------>AND

import java.util.*;
import java.util.stream.Stream;

public class MyClass {
    public static String longestSubstring(String s) {
        String s1 = "";
        int len = 0;
        String s2 = "";
        Set<Character> set = new HashSet<>();
        for (int x = 0; x < s.length() - 1; x++) {
            for (int i = x + 1; i < s.length(); i++) {
                s1 = s.substring(i, x);
                s1.split("");
                Arrays.asList(s1.toCharArray()).stream().map(m -> m.toString());
                if (!isDuplicate(s1)) {
                    if (len < s1.length()) {
                        len = s1.length();
                        s2 = s1;
                    }
                }
            }
        }
        return s2;
    }

    private static boolean isDuplicate(String s1) {
        Set<Character> set = new HashSet<>();
        for (int x = 0; x < s1.length(); x++) {
            if (set.contains(s1.charAt(x))) {
                return  false;
//                int fre = map.get(s1.charAt(x));
//                map.put(s1.charAt(x), fre + 1);
            } else {
                set.add(s1.charAt(x));
            }

        }
//        for (Map.Entry e : map.entrySet()) {
//            if ((Integer) e.getValue() > 1) {
//                return false;
//            }
//        }

        return true;


    }
//    String input="ANAND";
//    System.out.println(longestSubstring(input));

    public static void main(String[] args) {

        String input = "ANAND";
        String sub="AND";
       int xx= input.indexOf("AND");
//        System.out.println(input.substring(xx, xx+sub.length()));
//        System.out.println(longestSubstring(input));
        System.out.println(longestSubstringII("infosys"));
    }
    private static String longestSubstringII(String input) {
        Set<Character> set = new LinkedHashSet<>();
        int right=0;
        int left=0;
        while (right< input.length()) {
             if(!set.contains(input.charAt(right))){
                 set.add(input.charAt(right));
                 right++;
                 }
             else
             {
                 set.remove(input.charAt(left));
                     left++;
             }
        }
//        set.containsAll('A','N','D');
        String anser="";
        for (Character c: set){
            anser+= String.valueOf(c);
        }
        return  anser;

    }


}
