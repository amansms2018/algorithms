package com.example.algorithms.Algo;

public class Tes {

    public  Tes() {
        Bar b = new Bar();
        Bar b1 = new Bar();
        update(b);
        update(b1);
        b1 = b;
        update(b);
        update(b1);
    }
    private  void update(Bar bar){
        bar.x= 20;
        System.out.println(bar.x);
    }
    public static void main(String[] args) {
        new Tes();

    }

    private  class Bar{
         int x= 10;
    }
}
