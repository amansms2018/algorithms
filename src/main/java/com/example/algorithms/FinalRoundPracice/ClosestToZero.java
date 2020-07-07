package com.example.algorithms.FinalRoundPracice;

public class ClosestToZero {
    public  static int findClosest(int []ts){
         if( ts.length==0){
              return  0;
         }
         int closeValue= Math.abs(ts[0]);
          int ind= 0;

        for (int i = 0; i < ts.length; i++) {
             if(closeValue>Math.abs(ts[i])){
                 closeValue= Math.abs(ts[i]);
                 ind=i;
             }
             else if(closeValue==Math.abs(ts[i])){
                  if(ts[i]> 0){
                      ind=i;
                  }
            }

        }
        return  ind;

    }


    public static void main(String[] args) {
//        int []a= {7, 5, 9, 1, 4};
//        int []a= {5526};
//        int []a=  {-15, -7, -9, -14, -12};
//        int []a=  {};
        int []a={15, -7, 9, 14, 7, 12};
        System.out.println(findClosest(a));

    }
}
