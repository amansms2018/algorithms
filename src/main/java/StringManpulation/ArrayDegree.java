package StringManpulation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayDegree {
    public static void main(String[] args) {
   String inputData =" 1 2 2 3 1 ";
        System.out.println(" Max - " + codeHere( inputData));
    }

    public static String codeHere(String inputData) {

        List<Character> chars = new ArrayList<>();
        for (int i = 0; i < inputData.length(); i++) {
             if(inputData.charAt(i)!=' ')
            chars.add(inputData.charAt(i));
        }
         Map<Character, Long> mapCounts = chars.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));

      long max=  mapCounts.values().stream().max((v1, v2) -> (int) (v1 - v2)).get();

        System.out.println("map " + mapCounts);
        System.out.println("max " + max);
//        long reduce = mapCounts.keySet().stream().collect(Collectors.re.summingLong(Long::longValue));
//                .reduce(0l, (x1, x2) -> x1 + x2);
//        System.out.println(reduce);
        Character character = mapCounts.keySet().stream().filter((k -> k.equals(max)))
              .findFirst().get();
        System.out.println(" character with max fre= " + character);
        List<Character>subArrray= new ArrayList<>();
//        long minSubArrayElement=0;
//        for (int i = 0; i < chars.size(); i++) {
//            subArrray.add(chars.get(i));
//            for (int j = i+1; j <chars.size() ; j++) {
//                subArrray.add(chars.get(j));
//                if(isMinimuFound(subArrray.add(chars.get(j)))){
//                }
//            }
//        }


       return String.valueOf(max);


    }
}
