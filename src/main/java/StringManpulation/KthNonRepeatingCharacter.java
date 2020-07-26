package StringManpulation;

public class KthNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        System.out.println(findKthNonRepeatingChar(input, 2));
        input= input.replaceAll("ee","");
//        System.out.println(input.re);

    }

    private static char findKthNonRepeatingChar(String input, int i) {
         int count=0;
        for (int j = 0; j <input.length() ; j++) {
              if(input.indexOf(input.charAt(j))==input.lastIndexOf(input.charAt(j))){
                  count++;
              }
              if(count==2){
                  return  input.charAt(j);
              }

        }
        return  ' ';
    }
}
