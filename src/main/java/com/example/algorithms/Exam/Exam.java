package com.example.algorithms.Exam;

import java.util.*;

public class Exam {

//    Given an array of integers, find the subset of non-adjacent elements with the maximum sum.
//    Calculate the sum of that subset.
//    For example, given an array  we have the following possible subsets:
//        [-2,1,3,-4,5]
    //    [-2, 3, 5]   6
//        [-2, 3]      1
//        [-2, -4]    -6
//        [-2, 5]      3
//        [1, -4]     -3
//        [1, 5]       6
//        [3, 5]       8


    public  int mode( int []x ){
            Map<Integer, Integer> fr= new HashMap<>();
            int v;

        for (int i = 0; i < x.length ; i++) {
             if(fr.containsKey(x[i])){
                 v= fr.get(x[i])+1;
                 fr.put(x[i],v)
;             }
             else
             {
                 fr.put(x[i], 1);
             }


        }




        return 0;
    }

    public static void main(String[] args) {
        List<String>ss= new ArrayList<>();
        System.out.println("hello");
        Set<String> set;
        String s=  "I love Love to To tO code";
         String [] x= s.split(" ");

          set= new LinkedHashSet<>(Arrays.asList(x));

          String []x2=  new String[set.size()] ;
          set.toArray(x2);

//        for (int i = 0; i <x.length ; i++) {
//         set.add(x[i]) ;
//        }


        System.out.println(Arrays.toString(x2));

    }
}
