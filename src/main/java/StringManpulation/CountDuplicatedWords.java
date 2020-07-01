package StringManpulation;

import java.util.*;
import java.util.stream.Collectors;
public class CountDuplicatedWords {

    private List<String> findDuplicatedWord(String input) {
        List<String> result = new ArrayList<>();
        String[] words = input.split("[\\s.]+");
        Map<String, Long> collect = Arrays.asList(words).stream().collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        for (int i = 0; i < words.length; i++) {
            String tem= words[i].toLowerCase() + ": " + collect.get(words[i].toLowerCase());
           if ((!result.contains(tem))&& (collect.get(words[i].toLowerCase())>1)){
                result.add(tem);
            }
        }
            return result;
        }

    public static void main(String[] args) {
        String input = "Welcome to hello welcome java Java Session Session  to the the to Session.Thisis java core programming with Spring framework";
        CountDuplicatedWords countDuplicatedWords = new CountDuplicatedWords();
        for (String ss : countDuplicatedWords.findDuplicatedWord(input)) {
            System.out.println(ss);
        }
    }
    }
