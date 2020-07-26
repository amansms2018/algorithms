package Walmart;

import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipInputStream;

public class Walmart {
    public static void main(String[] args) {
        int []input= {2, 11, 5, 1, 4, 7};
        System.out.println(findTwoPartWithSumEqulatToTheRest(input));
    }

    private static String findTwoPartWithSumEqulatToTheRest(int[] input) {
         Set<Integer> set= new HashSet<>();
         int sum=0;
        for (int i = 0; i <input.length ; i++) {
            sum+=input[i];
            set.add(input[i]);
        }
        String res="";
        for (int i = 0;i< input.length; i++) {
             if( set.contains(sum-input[i])){
                 return  (sum-input[i]) + " " + input[i];
             }
        }
        return  "not found";


    }
}
