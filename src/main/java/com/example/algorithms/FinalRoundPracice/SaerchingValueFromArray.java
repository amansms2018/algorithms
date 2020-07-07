package com.example.algorithms.FinalRoundPracice;

import java.lang.reflect.Array;
import java.util.*;

public class SaerchingValueFromArray {
    public static boolean exists(int[] x, int k) {
//        List<Integer> mydata= new ArrayList<>();
//        mydata=Arrays.asList(x);

        return Arrays.binarySearch(x, k) >= 0 ? true : false;

    }

    public static void main(String[] args) {
        int[] ints = {-9, 14, 37, 102};
//        System.out.println(SaerchingValueFromArray.exists(ints, 7));
        int [] x=  {-9, 14, 37, 102};
        final OptionalInt first = Arrays.stream(x).parallel().filter(p -> p == (37)).findFirst();
        if (first.isPresent()){
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
