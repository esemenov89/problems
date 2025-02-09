package org.just.leetcode.study.plan.leetcode75;

import java.util.Arrays;
import java.util.Scanner;

public class Leetcode238_leetcode75 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] nums = new int[count];
        for (int i = 0; i < count; i++) {
            nums[i] = in.nextInt();
        }
        Leetcode238_leetcode75 leetcode = new Leetcode238_leetcode75();
        System.out.println(Arrays.toString(leetcode.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        // Скопировал решение у другого пользователя из солюшенов, разобрать как это работает
        int numsLength = nums.length;
        int prefixProduct = 1;
        int suffixProduct = 1;
        int[] result = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }
        for (int i = numsLength - 1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }
}