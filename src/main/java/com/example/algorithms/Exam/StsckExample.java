package com.example.algorithms.Exam;

import java.util.Stack;

public class StsckExample {

    public static boolean  isBalanced(String s){
        Stack<Character> c= new Stack();
        for (int i = 0; i <s.length() ; i++) {
               if(     s.charAt(i)=='('||
                       s.charAt(i)=='['||
                       s.charAt(i)=='{' )
               {
                   c.push(s.charAt(i));
               }

               else if((s.charAt(i)==')')&&(c.peek()=='(')){
                c.pop();
            }
               else if((s.charAt(i)==']')&&(c.peek()=='[')){
                c.pop();
            }
               else if((s.charAt(i)=='}')&&(c.peek()=='{')){
                   c.pop();
               }


        }
        return c.isEmpty();
    }

    public static void main(String[] args) {
        String ss=  "{}(";
//                "({()})";

        System.out.println(StsckExample.isBalanced(ss));
////                {}()
//        ({()})
//        {}(
//                []
    }
}
