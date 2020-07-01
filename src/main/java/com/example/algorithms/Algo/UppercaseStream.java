package com.example.algorithms.Algo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class UppercaseStream {

    public static void main(String[] args) {
        String [] x= {"j","a","v","a"};
        List<String> letter= Arrays.asList(x);
        System.out.println(letter.stream().collect(Collectors.joining()).toUpperCase());
        Random r= new Random();
        System.out.println(Math.random()*86);
        String ff="amanafsfsd";
        System.out.println(String.format("ff %s",ff));

    }
}
