package com.example.algorithms.Algo;

import java.util.Stack;

public class StringManipulation {
    Stack<Character> stackString1 = new Stack();
    Stack<Character> stackString2 = new Stack();
    public boolean IsTwoStringEqual(String s1, String s2) {
         if((s1.length()==0) & (s2.length()==0))
             return  true;
        if((s1=="") & (s2==""))
            return  true;


        for (int i = 0; i <s1.length() ; i++) {
            if('#'==s1.charAt(i)) {
                 if(!stackString1.empty()){
                     stackString1.pop();
                 }
        }
            else
            {
                stackString1.push(s1.charAt(i));
            }

        }
             s1="";
        while(!stackString1.isEmpty()){
            s1= stackString1.pop() + s1;
        }

//===========================
        for (int i = 0; i <s2.length() ; i++) {
            if('#'==s2.charAt(i)) {
                if(!stackString2.empty()){
                    stackString2.pop();
                }
            }
            else
            {
                stackString2.push(s2.charAt(i));
            }

        }
        s2="";
        while(!stackString2.isEmpty()){
            s1= stackString2.pop() + s2;
        }


        return s1.equalsIgnoreCase(s2);
    }
}
