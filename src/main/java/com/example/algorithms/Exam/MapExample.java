package com.example.algorithms.Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapExample {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                new Employee(1, "A", 100),
                new Employee(2, "A", 200),
                new Employee(3, "B", 300),
                new Employee(4, "B", 400),
                new Employee(4, "B", 700),
                new Employee(4, "B", 700),
                new Employee(5, "C", 500),
                new Employee(6, "C", 600)));

//        Map<String, List<Employee>> employeesMap = employeeList.stream()
//                .collect(Collectors.groupingBy(Employee::getName));

        Map<String,Long> employeesMap = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));

  Long max= employeesMap.values().stream()
          .max((e1, e2)->(int)(e1-e2))
          .orElseThrow(NoSuchFieldError::new);
  double sum=  employeesMap.values().stream()
          .reduce((long) 0.0, (x1, x2)->(x1+x2));

//        Map<Integer, Employee> employeesMap = employeeList.stream()
//                .collect( Collectors.toMap(Employee::getId,
//                        Function.identity()) );

        System.out.println(employeesMap);

        System.out.println("max=" + max);

        System.out.println("sum=" + sum);
    }
}
