package com.example.algorithms.Exam;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {

   private  int id;
    String name;
    int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

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

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //
//    public boolean equals(Employee e){
//         return e.getName().compareTo(this.name);
//    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return age == employee.age && name.equals(employee.name);
////                Objects.equals(name, employee.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

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

        Comparator<Employee>comparbyName= Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
        Comparator<Employee>comparbyAgeAndThenByName= Comparator.comparing(Employee::getAge).thenComparing(Employee::getName);
////       List<Employee>em2= emp.stream().sorted(comparbyName.).collect(Collectors.toList());
//        List<Employee>em2= emp.stream().sorted(comparbyName.reversed()).collect(Collectors.toList());
        System.out.println(emp.stream().sorted(comparbyName.reversed()).distinct().collect(Collectors.toList()));
//        System.out.println(em2);
    }
}
