package org.just.leetcode.leetcode2367;

public class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        for(int num1 : nums) {
            for(int num2 : nums) {
                for(int num3 : nums) {
                    if (num3 - num2 == diff && num2 - num1 == diff) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}