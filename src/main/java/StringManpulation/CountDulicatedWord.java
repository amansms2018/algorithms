package StringManpulation;

import org.springframework.beans.factory.ListableBeanFactoryExtensionsKt;

import java.sql.SQLOutput;
import java.util.*;

public class CountDulicatedWord {
    public static List<String> findAllDulictedWord(String string) {
        List<String> anser = new ArrayList<>();
        Map<String, Integer> myMap = new HashMap<>();
        String[] mys1 = string.split("[\\s.,]+");

        System.out.println("\n\n\n" + Arrays.toString(mys1));
        String myword;
        Integer tem;
        LinkedList<Integer> fre = new LinkedList<>();
        LinkedList<String> mywordList = new LinkedList<>();
        for (int i = 0; i < mys1.length; i++) {
            if (mywordList.contains(mys1[i].toLowerCase().trim())) {
                int v = fre.get(mywordList.indexOf(mys1[i].toLowerCase()));
                fre.set(mywordList.indexOf(mys1[i].toLowerCase()), v + 1);
            } else {
                mywordList.add(mys1[i].trim().toLowerCase());
                fre.add(1);
                System.out.println(mys1[i].trim().toLowerCase());
            }
        }
        for (int i = 0; i < fre.size(); i++) {
            if (fre.get(i) > 1)
                anser.add(mywordList.get(i) + ": " + fre.get(i));
        }
        System.out.println();
        return anser;
    }
    public static void main(String[] args) {
        String s = "Welcome to, Java Session, Welcome Session Session......   ,     Welcome This is programming with java";
        System.out.println();
         for( String ss: findAllDulictedWord(s)){
             System.out.println(ss);
        }
    }
}
