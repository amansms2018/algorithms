package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class TwoSongWithDuration60 {
    public static int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int t : time) {
            int d = (60 - t % 60) % 60;
            if (count.containsKey(d)) {
                ans += count.get(d);
            } // in current HashMap, get the number of songs that if adding t equals to a multiple of 60.
            count.put(t % 60, 1 + count.getOrDefault(t % 60, 0)); // update the number of t % 60.
        }
        return ans;
    }

    public static int numPairsDivisibleBy602(int[] time) {
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 0;
        for (int i = 0; i<time.length; i++) {
            count.put(time[i]%60, time[i]%60);
        }
        for (int t : time) {
             if(( t + count.get(t%60))== 60){
                 ans+= 1;
                 System.out.println( "t =" + "t%60 " + t%60 );
             }
        }
        return   ans;
    }

    public static void main(String[] args) {
        int song[] = {30, 20, 150, 100, 40};
        System.out.println(numPairsDivisibleBy602(song));
    }
}
