package SetExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetExample {

    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(5);
        set.add(6);
        set.add(8);
        set.add(9);

        Integer []x= new Integer[set.size()];
      set.toArray(x);
        System.out.println(Arrays.toString(x));


    }
}
