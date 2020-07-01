package com.example.algorithms.stream;

import com.example.algorithms.Exam.Employee;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class CountringBYHashMap {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("a", 40));
        emp.add(new Employee("A", 40));
        emp.add(new Employee("d", 55));
        emp.add(new Employee("Z", 55));
        emp.add(new Employee("Z2", 55));
        emp.add(new Employee("C", 41));
        emp.add(new Employee("C", 49));

        Comparator<Employee> comparbyName = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
        Comparator<Employee> comparbyAgeAndThenByName = Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
////       List<Employee>em2= emp.stream().sorted(comparbyName.).collect(Collectors.toList());
//        List<Employee>em2= emp.stream().sorted(comparbyName.reversed()).collect(Collectors.toList());
        System.out.println(emp.stream().sorted(comparbyName.reversed()).distinct().collect(Collectors.toList()));
//        System.out.println(em2);

        Map<String, Long> employByName = emp.stream()
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.counting()));
        System.out.println(" \nmap vales" + employByName);
/////
        Long min = emp.stream()
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.counting()))
                .values().stream().sorted((e1, e2) -> (int) (e1 - e2)).skip(1).findFirst().get();
//             .collect(Collectors.toList()).get(0);
        ;
        System.out.println("\n\n\n max value => " + min);

//        Map<String , List<String>>
        Map<String, List<Employee>> employByName2 = emp.stream()
                .collect(Collectors.groupingBy(Employee::getName));
        System.out.println(" map employByName2" + employByName2);

        //        Map<String , List<String>>
        Map<String, Long> employByName3 = emp.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.summingLong(Employee::getAge)));
        System.out.println(" \n map vales" + employByName3);

        ///// group employee my max age
        Comparator<Employee> sortByAge = Comparator.comparing(Employee::getAge);
        Map<String, Optional<Employee>> employByName4 = emp.stream()
                .collect(Collectors.groupingBy(Employee::getName, reducing(BinaryOperator.maxBy(sortByAge))));
        System.out.println(" \n map vales" + employByName4);


//
//        Map<City, Set<String>> namesByCity
//                = people.stream().collect(groupingBy(Person::getCity,
//                mapping(Person::getLastName, toSet())));


//        Map<String, Employee> employByName5= emp.stream().collect(toMap(Employee::getId,Functions.identity()));
//
//        System.out.println(" \n map vales" +employByName5);


        //////PartitioningBy


//        Map<String , List<String>>
        Map<Integer, List<String>> employByName6 = emp.stream()
                .collect(Collectors.groupingBy(Employee::getAge,
                        Collectors.mapping((Employee e) -> e.getName().toUpperCase(),
                                Collectors.toList())));

        System.out.println(" map vale 777" + employByName6);


        Employee e1 = new Employee("A", 80);
        Employee e2 = new Employee("A", 80);
        Map<Employee, String> map = new HashMap<>();
        map.put(e1, "person1");
        System.out.println(map.get(e2));


        /////Finding maxpackage com.example.algorithms.stream;
        //
        //import com.example.algorithms.Exam.Employee;
        //
        //import java.util.*;
        //import java.util.function.BinaryOperator;
        //import java.util.stream.Collectors;
        //import java.util.stream.Stream;
        //
        //import static java.util.stream.Collectors.*;
        //
        //public class CountringBYHashMap {
        //    public static void main(String[] args) {
        //        List<Employee> emp = new ArrayList<>();
        //        emp.add(new Employee("a", 40));
        //        emp.add(new Employee("A", 80));
        //        emp.add(new Employee("d", 55));
        //        emp.add(new Employee("z", 55));
        //        emp.add(new Employee("Z2", 7));
        //        emp.add(new Employee("C", 41));
        //        emp.add(new Employee("C", 49));
        //
        //        Comparator<Employee> comparbyName = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
        //        Comparator<Employee> comparbyAgeAndThenByName = Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
        //////       List<Employee>em2= emp.stream().sorted(comparbyName.).collect(Collectors.toList());
        ////        List<Employee>em2= emp.stream().sorted(comparbyName.reversed()).collect(Collectors.toList());
        //        System.out.println(emp.stream().sorted(comparbyName.reversed()).distinct().collect(Collectors.toList()));
        ////        System.out.println(em2);
        //
        //        Map<String, Long> employByName = emp.stream()
        //                .collect(Collectors.groupingBy(Employee::getName,
        //                        Collectors.counting()));
        //        System.out.println(" \nmap vales" + employByName);
        ///////
        //        Long min = emp.stream()
        //                .collect(Collectors.groupingBy(Employee::getName,
        //                        Collectors.counting()))
        //                .values().stream().sorted((e1, e2) -> (int) (e1 - e2)).skip(1).findFirst().get();
        ////             .collect(Collectors.toList()).get(0);
        //        ;
        //        System.out.println("\n\n\n max value => " + min);
        //
        ////        Map<String , List<String>>
        //        Map<String, List<Employee>> employByName2 = emp.stream()
        //                .collect(Collectors.groupingBy(Employee::getName));
        //        System.out.println(" map employByName2" + employByName2);
        //
        //        //        Map<String , List<String>>
        //        Map<String, Long> employByName3 = emp.stream()
        //                .collect(Collectors.groupingBy(Employee::getName, Collectors.summingLong(Employee::getAge)));
        //        System.out.println(" \n map vales" + employByName3);
        //
        //        ///// group employee my max age
        //        Comparator<Employee> sortByAge = Comparator.comparing(Employee::getAge);
        //        Map<String, Optional<Employee>> employByName4 = emp.stream()
        //                .collect(Collectors.groupingBy(Employee::getName, reducing(BinaryOperator.maxBy(sortByAge))));
        //        System.out.println(" \n map vales" + employByName4);
        //
        //
        ////
        ////        Map<City, Set<String>> namesByCity
        ////                = people.stream().collect(groupingBy(Person::getCity,
        ////                mapping(Person::getLastName, toSet())));
        //
        //
        ////        Map<String, Employee> employByName5= emp.stream().collect(toMap(Employee::getId,Functions.identity()));
        ////
        ////        System.out.println(" \n map vales" +employByName5);
        //
        //
        //        //////PartitioningBy
        //
        //
        ////        Map<String , List<String>>
        //        Map<Integer, List<String>> employByName6 = emp.stream()
        //                .collect(Collectors.groupingBy(Employee::getAge,
        //                        Collectors.mapping((Employee e) -> e.getName().toUpperCase(),
        //                                Collectors.toList())));
        //
        //        System.out.println(" map vale 777" + employByName6);
        //
        //
        //        Employee e1 = new Employee("A", 80);
        //        Employee e2 = new Employee("A", 80);
        //        Map<Employee, String> map = new HashMap<>();
        //        map.put(e1, "person1");
        //        System.out.println(map.get(e2));
        //
        //
        //        /////Finding max
        //        long max = emp.stream().max(Comparator.comparing(Employee::getAge)).get().getAge();
        //        System.out.println("max=age " + max);
        //
        //
        //    }
        //}
        long max = emp.stream().max(Comparator.comparing(Employee::getAge)).get().getAge();
        System.out.println("max=age " + max);
        Map<String, Integer> mydate = new HashMap<>();
        mydate.put("5", 55);
        mydate.put("3", 40);
        mydate.put("4", 80);
        mydate.put("1", 40);
//        System.out.println(mydate.entrySet().stream().max((d1,d2)-> d2.getValue()-d1.getValue()).get());
        ///Hashmap soring  by Key
        mydate.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);

        System.out.println();
        ///Hashmap soring  by Values
        System.out.println(" max map entry set  +  " +
                        mydate.entrySet().stream()
//                .sorted(Map.Entry.comparingByValue((Integer v1, Integer v2)->(v2-v1)))
//                .forEach(System.out::println);
                                .max((m1, m2) -> m1.getValue() - m2.getValue()).get()
        );


        Map.Entry<Integer, Long> integerLongEntry = Arrays.asList(5, 8, 9, 4, 4, 8, 9, 8, 2, 9, 9)
                .stream().
                        collect(groupingBy(e -> e, counting()))
                .entrySet().stream()
                .max((m1, m2) -> (int) (m1.getValue() - m2.getValue())).get();

        System.out.println();
        System.out.println(integerLongEntry);


//        =================
        Map<Integer, Set<String>> collect22 = emp.stream().collect(groupingBy(Employee::getAge, mapping(Employee::getName, toSet())));
        System.out.println(collect22);

        //// finding the minim
        int employee = emp.stream().max(Comparator.comparing(Employee::getAge)).get().getAge();
        String name = emp.stream().collect(minBy(Comparator.comparing(Employee::getName))).get().getName();


        List<Integer> collect3 = emp.stream().map(n -> n.getName().length()).sorted().collect(toList());
        System.out.println(collect3);


        ////


//        Map<String, Long> collect7 = emp.stream().collect(groupingBy(Employee::getName,summingLong()));
//        System.out.println(collect7);


    }


}


