package hackerRank;

import java.util.ArrayList;
import java.util.List;

public class PalindrumSubStringCount {
    public static   List<String> findlanidrumList(String s) {
        List<String> pList = new ArrayList<>();
        String tem;
        StringBuilder sb;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                tem = s.substring(i, j);
                sb = new StringBuilder(s.substring(i, j));
                if (tem.equals(sb.reverse().toString())) {
                    pList.add(tem);
                }
            }

        }

        return pList;
    }

    public static void main(String[] args) {

        System.out.println(findlanidrumList("aaa"));
    }
}
