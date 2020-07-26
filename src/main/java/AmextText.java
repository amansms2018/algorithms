import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AmextText {
//
//    Given an array of integers, return indices of the two numbers such that they add up to a specific target.
////    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//            Example:
//
//    Given nums = [2, 7, 11, 15], target = 9,
//
//    Because nums[0] + nums[1] = 2 + 7 = 9,
//            return [0, 1].
    public  static String findParis( int [] input, int k){
        Map<Integer,Integer> map=  new HashMap<>();
        for (int i = 0; i < input.length; i++) {
                if(!map.containsKey(k-input[i])){
                    map.put(input[i],i) ;
             }
                else
                {
                    return  "["+ map.get(k-input[i]) +" " + i + "]";
                }
        }

        return  "";
            }

    public  static String findParisValues( int [] input, int k){
        Map<Integer,Integer> map=  new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(map.containsKey(input[i]+k)){
                return  "["+ map.get(k+input[i]) +" " + input[i] + "]";

            }
            else
            {
                map.put(input[i],input[i]) ;
            }
        }

        return  "";
    }
    public static  String paredIndex( int [] input,int target){
         List<Integer> list = new ArrayList<>();
//                   Arrays.stream(input).map(m-> (Integer)(m)).collect(Collectors.toList());
        final Map<Integer, List<Integer>> collect = Arrays.stream(input).boxed().collect(Collectors.groupingBy(e -> e));




        System.out.println("collect= "+ collect);

        int  valu=0;
        for (int i = 0; i < input.length; i++) {
            valu=  target- input[i];
             if( list.contains(valu)){
                  if(list.indexOf(valu)!=i)
                  return  "[ " + i + ", " + list.indexOf(valu) + "]";
             }

        }

        return " No two numbers that sum up to : " + target;

    }


    public static void main(String[] args) {
        int[]  input= {2, 7, 11, 7,15 };

        System.out.println(findParis(input, 9));
        System.out.println(findParisValues(input, 4));
        System.out.println(paredIndex(input, 9));

//     Integer x= null;
//     int y= x;
//        System.out.println("y " + y);

        System.out.println( Character.isAlphabetic('#'));


        /////1,21,3,4,1,1,5,4
        //finding the most frequently occuring element using java 8

//        Integer[] x={1,21,3,4,1,1,5,4};
//        List<Map.Entry<Integer, Long>> collect = Arrays.stream(x).
//                collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream().sorted((Comparator<? super Map.Entry<Integer, Long>>) Map.Entry.comparingByValue().reversed()).limit(1).collect(Collectors.toList());
//        System.out.println(" Soring using Java 8  " + collect);

         String xx="Amanuel";
         String x2= null;
         System.out.println("Equating null " + xx.equals(x2));

    }


}
