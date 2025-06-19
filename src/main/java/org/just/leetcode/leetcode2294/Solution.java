package org.just.leetcode.leetcode2294;

import java.util.Arrays;

public class Solution {

    public int partitionArray(int[] nums, int k) {
        int result = 1;
        Arrays.sort(nums);
        int j;
        for (int i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[j] - nums[i] > k) {
                    result++;
                    i = j - 1;
                    break;
                }
            }
            if (j >= nums.length - 1) {
                break;
            }
        }
        return result;
    }
}