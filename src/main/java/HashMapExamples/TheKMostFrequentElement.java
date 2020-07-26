package HashMapExamples;

import java.util.*;
import java.util.stream.Collectors;

public class TheKMostFrequentElement {

    public static void main(String[] args) {

        int []x =
//                {1,1,1,2,2,3};
                {4,5,5,2,1,1,5,2,3,3,5,2};
//        System.out.println( Arrays.toString(findKFrequentElement(x, 2)));
        List<Integer> list= new ArrayList<>();
        System.out.println(Arrays.toString(topKFrequent(x, 2)));
        int [] x2= new int[list.size()];
//         x2=  (int [])list.toArray();




    }



    public static int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }

        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> count.get(n2) - count.get(n1));

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n : count.keySet()) {
            heap.offer(n);
//            if (heap.size() > k) heap.poll();
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
//        for(int i = k - 1; i >= 0; --i) {
//            top[i] = heap.poll();
//        }
        for (int i = 0; i < k; i++) {
            top[i] = heap.poll();
        }
        return top;
    }
    private static int [] findKFrequentElement(int[] x, int k) {
        int [] ans= new int[k];
          if(x.length<k){
               return  x;
          }

        int[] ints = Arrays.stream(x).boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(k)
                .mapToInt(m -> m.getKey())
                .toArray();
        System.out.println("collection " + Arrays.toString(ints));

        return   ints;
    }

}
