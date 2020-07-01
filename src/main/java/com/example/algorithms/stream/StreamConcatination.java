package com.example.algorithms.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatination {
    public static void main(String[] args) {

        List<Integer> l1= Arrays.asList(5, 7, 8, 9);

        List<Integer> l2= Arrays.asList(5, 6, 10, 9);
        List<Integer> collect = Stream.concat(l1.stream().filter(v1 -> !l2.contains(v1)), l2.stream().filter(v2 -> !l1.contains(v2)))
                .sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
