package com.example.algorithms;


import javax.swing.*;

public class Test2 extends Thread {
    private String message;
    public Test2(String mgs) {
        this.message = mgs;
    }
    public void run() {
//        synchronized (Test2.class){
        synchronized (this) {
            System.out.println(this.message);
        }
    }
//    Create a thread implementation that prints a string passed in its constructor
//        . Instantiate it three times with "One","Two", and "Three".
//    Invoke the threads to print "Three Two One" (Guarantee the order).

    public static void main(String[] args) {
        Thread t1 = new Test2("Test1");
        Thread t2 = new Test2("Test2");
        Thread t3 = new Test2("Test3");
        t3.start();
        t2.start();
        t1.start();

//        t.start();
////        t1.run();
////        t2.run();
////        t3.run();

    }

}
