
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingPairs {
     public static   int display( int [] x, int sum) {
         Map<Integer, Integer> mymap= new HashMap<>();
         Set<Integer> myset= new HashSet<>();
         int   f=0;
         for (int i = 0; i < x.length; i++) {
              mymap.put(sum-x[i],sum-x[i] );
         }
         for (int i = 0; i <x.length ; i++) {
              if(mymap.containsKey(x[i])) {
//                 f= mymap.get(x[i]);
                 myset.add(mymap.get(x[i]));
              }

         }

          return myset.size();


     }
    public static void main(String[] args) {
         int []x= {1, 5, 7, -1, 5};
        System.out.println(display(x, 6) );

    }
}
