package org.just.leetcode.leetcode3300;

public class Solution {

    public int minElement(int[] nums) {
        int result = 100000;
        for (int num : nums) {
            if (sumDigits(num) < result) {
                result = sumDigits(num);
            }
        }
        return result;
    }

    private int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}