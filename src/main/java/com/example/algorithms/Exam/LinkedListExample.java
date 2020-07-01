package com.example.algorithms.Exam;

import java.util.LinkedList;

public class LinkedListExample {
//    private LinkedList<String> stringList= new LinkedList<String>();
    private static LinkedList<String> stringList= new LinkedList<String>();
    public   static void displayAllString(){

        stringList.addFirst("amanue");
        stringList.addLast("Lemma");
        stringList.addLast("Yani");
        stringList.addFirst("Bifa");
        stringList.removeFirst();

 for( String ls: stringList){
     System.out.println(ls);

 }


    }
    public static void main(String[] args) {
        LinkedListExample.displayAllString();
    }
}
