package org.just.leetcode.leetcode1920;

public class Solution {

    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, j = 0; i < nums.length && j < nums.length; i++, j++) {
            result[j] = nums[nums[i]];
        }
        return result;
    }
}