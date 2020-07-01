package com.example.algorithms.stream;

//import Employee;

import com.example.algorithms.Algo.Employee;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamManipulation {
    public static void main(String[] args) {
        IntStream sStream= IntStream.rangeClosed(0,100000);



//        IntStream parallelStream= IntStream.rangeClosed(0,100000);
//        List<Integer> myData= new ArrayList<>();
//        for (int i = 0; i <=100000 ; i++) {
//            myData.add(i);
//        }
//
//        int sSum= sStream.sum();
////        sSum=  myData.parallelStream().reduce(0,((x,y)->x+y));
////        int pSum=parallelStream..parallelStream().sum();
////        System.out.println("sSum= " + sSum + " PSum  " + pSum );
//
////        sStream= IntStream.range(0,100000);
////        parallelStream= IntStream.range(0,100000);
//        long sCount= sStream.count();
//        long pCount= parallelStream.parallel().count();
//        System.out.println("sCount= " + sCount + " PCount  " + pCount);

      int x1= 4566;
      int y= 5;

        float x=  (float)x1/(float)y;
        System.out.println("\n\n\n\n" + x);


        DecimalFormat df = new DecimalFormat("#.###");
        String formatted = df.format(2.456345);
        System.out.println(formatted);


//        ===========

        List<Employee> employeeList = createEmployeeList();
        Map<String, List<Employee>> map = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getName));

    }

    public static List<Employee> createEmployeeList()
    {
        List<Employee> employeeList=new ArrayList<>();

        Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Mary",18);
        Employee e5=new Employee("John",26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }
}
