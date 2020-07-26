package HashMapExamples;

import java.util.*;
import java.util.stream.Stream;

public class HashMapExample {

    public static void main(String[] args) {
        int x[]={5, 7,8,9,1,4,9,9,6,5};

        List<Integer>list= new ArrayList<>();
        String xx= "Amanuel";
        xx.replace("Am","");
        System.out.println("xx " + xx.replace("Am",""));

        String [] name= {"Aman", "Bifa", "Biani"};
        System.out.println(findKthLmax( x,  2));
        System.out.println(findKthLmaxII( name,  2));
    }

    private static String findKthLmaxII(String[] name, int i) {
//        List<String>list = new ArrayList<>();
//        list= Arrays.asList(name);
        return   Arrays.asList(name).stream().sorted((e1, e2)->e2.compareTo(e1)).distinct().skip(i-1).limit(1).findFirst().get();

//        return  Arrays.stream(name).sorted((e1, e2)->e2.compareTo(e1)).distinct().skip(i-1).limit(1).findFirst().get();

//        Map<Integer,List<Integer>> map = new HashMap<>();
//        List<Integer> list
//        for(Map.Entry e: map.entrySet()){
//            ((List<Integer>)(e.getValue())).s
//
//        }
    }



    private static int findKthLmax(int[] x, int k) {

        return  Arrays.stream(x).boxed().sorted((e1, e2)->(int)(e2-e1)).distinct().skip(k-1).limit(1).findFirst().get();
    }
}
