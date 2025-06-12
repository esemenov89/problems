package org.just.leetcode.leetcode3423;

public class Solution {

    public int maxAdjacentDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                if (Math.abs(nums[i] - nums[nums.length - 1]) > result) {
                    result = Math.abs(nums[i] - nums[nums.length - 1]);
                }
            }
            if (Math.abs(nums[i] - nums[i + 1]) > result) {
                result = Math.abs(nums[i] - nums[i + 1]);
            }
        }
        return result;
    }
}