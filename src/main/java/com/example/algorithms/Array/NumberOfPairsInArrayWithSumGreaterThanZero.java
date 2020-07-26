package com.example.algorithms.Array;

import java.util.Arrays;

public class NumberOfPairsInArrayWithSumGreaterThanZero {

    public static void main(String[] args) {
        int [] x= {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        System.out.println(findNumberOfParis(x));
    }
    private static int findNumberOfParis(int[] x) {
        Arrays.sort(x);
        int index=0;
        for (int i = 0; i <x.length ; i++) {
             if( x[i]+x[x.length-1]>0){
                 index=i;
                 break;
             }
        }
        index++;
        System.out.println("index " + index);
        int n= x.length-index+1;
        return (combination(n)/(combination(index))*(combination(n- index)));


    }

    private static int combination(int num) {
        System.out.println("n " + num);
        int fact= 1;
        for (int i = 2; i <num ; i++) {
            fact= fact*i;
        }
        return  fact;
    }
}
