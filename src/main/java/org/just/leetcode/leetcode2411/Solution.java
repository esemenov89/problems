package org.just.leetcode.leetcode2411;

public class Solution {

    public int[] smallestSubarrays(int[] nums) {
        int[] result = new int[nums.length];
        int maxOr;
        int tempOr;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                result[i] = 1;
                break;
            }
            maxOr = 0;
            tempOr = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                tempOr = tempOr | nums[j];
                if (tempOr > maxOr) {
                    maxOr = tempOr;
                }
            }
            tempOr = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                tempOr = tempOr | nums[j];
                if (tempOr == maxOr) {
                    result[i] = j - i + 1;
                    break;
                }
            }
        }
        return result;
    }
}