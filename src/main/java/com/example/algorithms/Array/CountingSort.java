package com.example.algorithms.Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CountingSort {
    private static  int[] x={2, 6, 4,8,4,2,6,8,4,6};

    public static   void countSort(){
        int max= x[0];
        int min=x[0];
        for (int i =1; i <x.length ; i++) {
            if(x[i]<  min) {
                 min= x[i];
            }
            if(x[i]>max){
                 max= x[i];
            }
        }
        int []x2= new int[max+ 1];
        for (int i = 0; i < x2.length; i++) {
            x2[0]=0;
        }

        for (int i = 0; i < x.length; i++) {
            x2[x[i]]+=1;
        }

        int []x3= new int[x.length];

        int k=0;
        for (int i = 0; i < x2.length; i++) {
            while (x2[i]!=0){
                x[k]=i;
                k++;
                x2[i]--;
            }

        }

        System.out.println(Arrays.toString(x));



    }
    public static void main(String[] args) {
     countSort();

    }
}
