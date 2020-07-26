package Permtutation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Permtuation {
    private static void Swap(char a, char b) {
        if (a == b) return;
        char temp = a;
        a = b;
        b = temp;
    }
    public static void GetPer(char[] list) {
        int x = list.length - 1;
        GetPer(list, 0, x);
    }
    private static void GetPer(char[] list, int k, int m) {
        if (k == m) {
            System.out.println(list);
        } else
            for (int i = k; i <= m; i++) {
                Swap(list[k], list[i]);
                GetPer(list, k + 1, m);
                Swap(list[k], list[i]);
            }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, nums, result);
        return result;
    }
    private static void helper(int start, int[] nums, List<List<Integer>> result) {
        if (start == nums.length - 1) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            result.add(list);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, i, start);
            helper(start + 1, nums, result);
            swap(nums, i, start);
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        String str = "ABC";
        int[] x = {1, 2, 3};
        char[] arr = str.toCharArray();
        GetPer(arr);

        System.out.println("permtuation Method  two " + permute(x));


    }

}