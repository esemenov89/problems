package org.just.leetcode.leetcode3024;

public class Solution {

    public String triangleType(int[] nums) {
        String result = "scalene";
        if (nums[0] >= nums[1] + nums[2] || nums[1] >= nums[2] + nums[0] || nums[2] >= nums[0] + nums[1]) {
            return "none";
        }
        if (nums[0] == nums[1] && nums[1] == nums[2]) {
            return "equilateral";
        }
        if (nums[0] == nums[1] || nums[1] == nums[2] || nums[2] == nums[0]) {
            return "isosceles";
        }
        return result;
    }
}