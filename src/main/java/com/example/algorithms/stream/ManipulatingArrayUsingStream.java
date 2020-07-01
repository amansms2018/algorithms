package com.example.algorithms.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ManipulatingArrayUsingStream {
    public static void main(String[] args) {

        List<Integer> myData = new ArrayList<>();
        myData.add(4);
        myData.add(67);
        myData.add(99);
        myData.add(4);
        myData.add(4);
        myData.add(99);
        Map<Integer, Long> myfre = myData.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

// Long  mod= myData.stream()
//                .collect(Collectors.groupingBy(e ->e, Collectors.counting()))
//         .entrySet().stream().map(m->m.getValue())
//          .max((e1, e2)-> (int)(e1-e2)).get();
//
//        System.out.println(mod);



        Long aLong = myData.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream().map(m -> m.getValue())
                .max((e1, e2) -> (int) (e1 - e2)).get();

        System.out.println(aLong);



        //////PartioningBy

    }
}
