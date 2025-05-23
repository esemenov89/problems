package org.just.leetcode.leetcode2873;

public class Solution {

    public long maximumTripletValue(int[] nums) {
        long result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if ((long) (nums[i] - nums[j]) * nums[k] > result) {
                        result = (long) (nums[i] - nums[j]) * nums[k];
                    }
                }
            }
        }
        return result;
    }
}