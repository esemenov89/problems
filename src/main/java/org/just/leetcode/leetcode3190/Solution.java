package org.just.leetcode.leetcode3190;

public class Solution {

    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                result++;
            }
        }
        return result;
    }
}