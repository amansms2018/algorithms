package com.example.algorithms.Algo;

import java.util.Arrays;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {
//    IntStream i = IntStream.of(6,5,7,1, 2, 3, 3);
//    int [] x={4,6,9,12,44,77,99};
//    int d = i.sum();
//       i = IntStream.of(6,5,7,1, 2, 3, 3);
//    long c= i.count();
//    System.out.println(d);
//    System.out.println(c);
//    int  max= Arrays.stream(x).max().getAsInt();
//    System.out.println(" max " + max );


    Supplier<IntStream> streamSupplier = () -> IntStream.rangeClosed(0,1000000);
    Supplier<IntStream> parallelStreamSupplier = () -> IntStream.rangeClosed(0,1000000);
     int sum= streamSupplier.get().sum();
     int sumPar= parallelStreamSupplier.get().parallel().sum();
     long cp= parallelStreamSupplier.get().parallel().count();
    System.out.println("Supplier Sum= " + sum  + "  sum  obtained form Parallel " + sumPar );
    long c2= streamSupplier.get().count();
    System.out.println(" count from Supplier " + c2 +" pa count  " + cp);

//    Optional<String> result1 = streamSupplier.get().findAny();
//    System.out.println(result1.get());
//    Optional<String> result2 = streamSupplier.get().findFirst();
//    System.out.println(result2.get());

  }
}