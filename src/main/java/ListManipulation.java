import java.lang.reflect.Array;
import java.security.KeyStore;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.toMap;

public class ListManipulation {

    public static void main(String[] args) {

        Integer[] arrival = {978, 409, 229, 934, 299, 982, 636, 14, 866, 815, 64, 537, 426, 670, 116, 95, 630};
        Integer[] duration = {502, 518, 196, 106, 405, 452, 299, 189, 124, 506, 883, 753, 567, 717, 338, 439, 145};

        System.out.println(display(Arrays.asList(arrival), Arrays.asList(duration)));
    }

    private static int display(List<Integer> arrival, List<Integer> duration) {
        Map<Integer, Integer> myMap = new LinkedHashMap<>();
        for (int i = 0; i < arrival.size(); i++) {
            if (myMap.containsKey(arrival.get(i))) {
                Math.min(myMap.getOrDefault(arrival.get(i), 0), duration.get(i));
            } else {
                myMap.put(arrival.get(i), duration.get(i));
            }
        }
        final LinkedHashMap<Integer, Integer> map_collect = myMap.entrySet().stream()
                .sorted(comparingByKey())
                .collect(toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (x, y) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new
                ));

//        System.out.println("map  " + map_collect);
//        duration = map_collect.values().stream().collect(Collectors.toList());
//        System.out.println("duration  " + duration);
//        arrival = map_collect.keySet().stream().collect(Collectors.toList());
//        System.out.println("arrival  " + arrival);
        int count = 0;
        for (int i = 0; i < duration.size()-1; i++) {
            if (arrival.get(i) + duration.get(i) <= arrival.get(i + 1)) {
                count++;
            }
        }
        return count;

    }

//                .forEach((v)-> {System.out.println(v);}
//        );

//                .collect(Collectors.groupingBy(e -> e));


    //        List<Integer> sortedArivale= new ArrayList<>();
//        sortedArivale= arrival;
//        Collections.sort(sortedArivale);
//        System.out.println(sortedArivale.toString());
//        System.out.println("arrivale---->" + arrival);
    int location = 0;
    int count = 0;


//        for (int i = 0; i < sortedArivale.size() - 1; i++) {
//            int xx=sortedArivale.get(i);
//            location= arrival.indexOf(xx);
//            System.out.println(i +"--> location-->" +location +" value " +  duration.get(location));
////            if ((sortedArivale.get(i) != sortedArivale.get(i + 1)) &&
////                    ((sortedArivale.get(i) + duration.get(location)) < sortedArivale.get(i + 1)))
////            {
////
////                count += 1;
////            }
//        }


}
