package com.example.algorithms.stream;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class VouleandConsonentClassifier {



    public static void main(String[] args) {

        Predicate<Character> LetterClassifier=(aa)-> {
            if ((aa=='a') || (aa=='e') || (aa=='u') || (aa=='o') || (aa == 'i')) {
                return true;
            }
             else{
                return false;
            }
        };
        String mystring="abasherkortfhlksnkprwsafjgit";
        char[] ch= mystring.toCharArray();
//        Map<Boolean, List<char[]>> collect = Arrays.asList(ch).stream().collect(Collectors.groupingBy(e -> {
//            return (e.equals('a') ||
//                    e.equals('u') ||
//                    e.equals('e') ||
//                    e.equals('i') ||
//                    e.equals('o'));
//        }));

//        Map<Boolean, List<Character>> collect = (Map<Boolean, List<Character>>) Arrays.asList(ch).stream().
//                collect(Collectors.groupingBy(LetterClassifier::test,Collectors.toList()));

//        System.out.println(collect);

    }
}
