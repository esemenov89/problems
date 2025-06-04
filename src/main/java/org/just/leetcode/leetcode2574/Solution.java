package org.just.leetcode.leetcode2574;

public class Solution {

    public int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        for (int i = 1, j = nums.length - 2; i < nums.length && j >= 0; i++, j--) {
            if (i == 1) {
                leftSum[i] = nums[i - 1];
            } else {
                leftSum[i] = leftSum[i - 1] + nums[i - 1];
            }
            if (j == nums.length - 2) {
                rightSum[j] = nums[j + 1];
            } else {
                rightSum[j] = rightSum[j + 1] + nums[j + 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        return result;
    }
}