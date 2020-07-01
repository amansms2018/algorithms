package com.example.algorithms.Exam;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringManipulation {

    public StringManipulation() {
    }

    static int[] matchingStrings(String[] strings, String[] queries) {
        Set<String> stringSet2;
        Map<String, Integer> map = new HashMap<>();
        int[] result;
        Integer fr = 0;
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                fr = map.get(strings[i]) + 1;
                map.put(strings[i], fr);
            } else
                map.put(strings[i], 1);
        }

        result = new int[map.size()];
        for (int k = 0; k < queries.length; k++) {
            if (map.containsKey(queries[k])) {
                System.out.println(map.get(queries[k]));
                result[k] = map.get(queries[k]);
            } else {
                //            }}
                result[k] = 0;// map.getOrDefault(map.get(queries[k]), 0);

            }
        }
//        stringSet2=  new HashSet<>(map.values());
//        map.forEach((k, v) -> {
//            System.out.println("k:" + k + " v:  " + v);
//            stringSet2.add(v);
//        });

        stringSet2 = map.entrySet().stream()
                .map(k -> k.getKey())
                .collect(Collectors.toSet());
        Integer[] arry = map.values()
                .stream()
                .toArray(Integer[]::new);
        System.out.println(Arrays.toString(arry));
        Integer  max = map.values().stream().max((e1, e2) -> e1 - e2)
                .orElseThrow(NoSuchElementException::new);

        Integer  min = map.values().stream().min((e1, e2) -> e1 - e2).get();
//                .orElseThrow(NoSuchElementException::new);
        System.out.println(" min " +  min);

//        Map<String, Integer>  map1= Stream.of(strings)
//                                   .collect(Collectors.groupingBy(strings,))

        return result;

    }

    public static void main(String[] args) {
        String[] s = {"aba", "baba", "aba", "xzxb"};
        String[] q = {"aba", "xzxb", "ab"};
        System.out.println(Arrays.toString(StringManipulation.matchingStrings(s, q)));

    }
}
