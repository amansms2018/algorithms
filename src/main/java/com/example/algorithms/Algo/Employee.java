package com.example.algorithms.Algo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Employee {

    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//
//    public boolean equals(Employee e){
//         return e.getName().compareTo(this.name);
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && name.equals(employee.name);
//                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public int compare(Object  e1, Object e2) {
// Employee e11= (Employee)e1;
//        Employee e12= (Employee)e2;
//        return e11.age-e12.age;
//    }

    public static void main(String[] args) {
          List<Employee> emp= new ArrayList<>();
          emp.add(new Employee("A", 40));
        emp.add(new Employee("A", 40));
        emp.add(new Employee("D", 55));
        emp.add(new Employee("Z", 55));
        emp.add(new Employee("Z2", 7));
        emp.add(new Employee("C", 41));
        emp.add(new Employee("C", 41));

//        Collections.sort(emp);
//        System.out.println(emp);

        Comparator<Employee>comparbyName= Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
        Comparator<Employee>comparbyAgeAndThenByName= Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
////       List<Employee>em2= emp.stream().sorted(comparbyName.).collect(Collectors.toList());
//        List<Employee>em2= emp.stream().sorted(comparbyName.reversed()).collect(Collectors.toList());
        System.out.println(emp.stream().sorted(comparbyName).distinct().collect(Collectors.toList()));
//        System.out.println(em2);
    }
}
