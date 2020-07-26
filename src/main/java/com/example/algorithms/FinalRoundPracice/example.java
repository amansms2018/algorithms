package com.example.algorithms.FinalRoundPracice;


import java.util.*;
import java.util.stream.Stream;

public class example {

    static String allString(){
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("efg");
        return list.toString();
    }
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>(2);
        l.add(3);
        l.add(4);
        l.add(6);
        System.out.println(l.size());
        Set<Integer> set= new LinkedHashSet<>();
         set.add(4);
         set.add(7);
         set.add(9);

         int [] arry= new int[set.size()];
//         set.toArray(arry);

        System.out.println(Arrays.toString(set.toArray())) ;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("\n");
        stringBuilder.append("BCD");
        stringBuilder.append("\n");
        stringBuilder.append("cde");
        System.out.println(stringBuilder);

        System.out.println(allString());

        Integer max = Stream.of(78, 89, 45).max((m1,m2)->m2-m1).get();
        System.out.println(max);

    }
}
