package org.just.leetcode.leetcode2411;

import java.util.Arrays;

public class Solution {

    public int[] smallestSubarrays(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int[] latestOneBitIndices = new int[32];
        Arrays.fill(latestOneBitIndices, -1);
        for (int i = length - 1; i >= 0; --i) {
            int subarraySize = 1;
            for (int j = 0; j < 32; ++j) {
                if (((nums[i] >> j) & 1) == 1) {
                    latestOneBitIndices[j] = i;
                } else if (latestOneBitIndices[j] != -1) {
                    subarraySize = Math.max(subarraySize, latestOneBitIndices[j] - i + 1);
                }
            }
            result[i] = subarraySize;
        }
        return result;
    }
}