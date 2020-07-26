package StringManpulation;

import java.util.Arrays;

public class ArrayToString {
    public static void main(String[] args) {

        String  s= "Ab sc d e r  ty";
         String []chararray= s.split(" ");
         String s2= Arrays.toString(chararray);
        System.out.println(s2);
    }
}
