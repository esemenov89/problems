package org.just.leetcode.leetcode2016;

public class Solution {

    public int maximumDifference(int[] nums) {
        int result = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j]) {
                    result = Math.max(result, nums[i] - nums[j]);
                }
            }
        }
        return result;
    }
}