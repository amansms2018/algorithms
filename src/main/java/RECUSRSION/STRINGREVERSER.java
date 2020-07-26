package RECUSRSION;

public class STRINGREVERSER {
    public  static String reversString(String s1){
         if((s1== null)|| s1.length()==0) {
             return "";
         }
             else
              return  reversString(s1.substring(1)) + String.valueOf(s1.charAt(0));
    }
}
