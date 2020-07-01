package FunctionalPrograming;


import com.example.algorithms.Exam.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class FunctionalProgrammingExample {

    public static void main(String[] args) {
        Function<List<Integer>,Integer> sum= (num)-> num.stream().reduce((int)0, (x, y)-> x+y);
        Predicate<Integer> predicate =(i)-> i>10 ?true:false;
        Supplier< LocalDate> mydate=()-> LocalDate.now();
        Consumer< Integer>myv=(v)-> System.out.println(v);
        BiFunction<Integer, Integer, Boolean> comparMydata=(v1, v2)->v1==v2? true:false;

        List<Integer> mydata= Arrays.asList(22,5,7,8,9);
        System.out.println(sum.apply(mydata));
        System.out.println(predicate.test(50));
        System.out.println(mydate.get());
        myv.accept(60);
        System.out.println(comparMydata.apply(5,5));
        List<Integer> xx= new ArrayList<>();
         xx.add(67);
//         xx.add(new Employee("a", 40));



    }
}
