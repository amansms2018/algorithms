package com.example.algorithms.Algo;

public class ExceptionExer {
    public static void main(String[] args) {
        System.out.println(errerDis());
    }
    public  static  int  errerDis(){
        int a, b;
        a = b = 6;
        try {
            return a/b;
        }
//        catch(RuntimeException e) {
//            return -1;
        catch(ArithmeticException e) {
            return 0;
        } finally{
            return 6;
//            System.out.print("done");
        }
    }
}
