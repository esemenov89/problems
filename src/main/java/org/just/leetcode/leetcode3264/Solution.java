package org.just.leetcode.leetcode3264;

public class Solution {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int[] result;
        int indexMin;
        int min;
        for (int i = 0; i < k; i++) {
            indexMin = 0;
            min = nums[0];
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    indexMin = j;
                }
            }
            nums[indexMin] = nums[indexMin] * multiplier;
        }
        result = nums;
        return result;
    }
}