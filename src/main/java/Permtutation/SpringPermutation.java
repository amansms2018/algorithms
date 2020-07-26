package Permtutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SpringPermutation {
    private   int age;
    private  String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpringPermutation that = (SpringPermutation) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public static List<String> permute(char[] nums) {
       List<String> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }



    private static void helper(int start, char[] nums, List<String> result) {
        if (start == nums.length - 1) {
            ArrayList<String> list = new ArrayList<>();
            if(!result.contains(String.valueOf(nums))){
                result.add(String.valueOf(nums));
            }
//            result.add(String.valueOf(nums));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            helper(start + 1, nums, result);
            swap(nums, i, start);
        }
    }
    private static void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        String  s="ABCA";
        System.out.println(permute(s.toCharArray()));
    }
}
