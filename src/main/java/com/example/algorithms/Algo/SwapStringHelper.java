package com.example.algorithms.Algo;

public class SwapStringHelper {


    SwapStringHelper(){

    }

    public String swapingLastTwoChar(String ab) {
        if(ab.length()==1|| ab=="")
            return ab;
        char chf= ab.charAt(0);
        char chl= ab.charAt(ab.length()-1);
        return  chl + ab.substring(1,ab.length()-1) + chf;

    }
}
