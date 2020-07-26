package ThreadExample;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class ThreadMain {
    public static void main(String[] args) {
        printMyName("Amanue");


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers.stream().mapToInt(e->e).summaryStatistics();

        System.out.println("Lowest number in List : " + stats.getMin());
    }

    private static void printMyName(String name) {
//        name = name + "Bifa";
        Runnable r = () -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("Wellcome:" + name);
        };
        new Thread().start();
        System.out.println("your name is " + name);

        String x = "bSSSSSS";
        String zzz= x.replace('O','Z');
        x.indexOf('b');

        StringBuilder sb= new StringBuilder();
        sb.delete(0,sb.length());
        System.out.println(" delete " + sb );
//        System.out.println(  x.charAt(3).to);
    }



}
