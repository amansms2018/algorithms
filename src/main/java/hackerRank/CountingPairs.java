package hackerRank;

import java.util.*;
public class CountingPairs {
    public static int display(Integer[] x, int sum) {
        Map<Integer, Integer> mymap = new HashMap<>();
        Set<Integer> myset = new HashSet<>();
        int f = 0;
        for (int i = 0; i < x.length; i++) {
            mymap.put(sum - x[i], sum - x[i]);
        }
        for (int i = 0; i < x.length; i++) {
            if (mymap.containsKey(x[i])) {
//                 f= mymap.get(x[i]);
                myset.add(mymap.get(x[i]));
            }
        }
        System.out.println(myset);
        return myset.size();
    }

    public static int findXYWithSumZ(Integer[] x, int k) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        list = Arrays.asList(x);
        for (int i = 0; i < x.length; i++) {
            if (list.contains(list.get(i) + k)) {
                set.add(list.get(i));
            }

        }
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {
        Integer[] x = {1, 5,1, 7, -1, 5};
        System.out.println(findXYWithSumZ(x, 6));
        System.out.println(display(x, 6 ));
    }
}
