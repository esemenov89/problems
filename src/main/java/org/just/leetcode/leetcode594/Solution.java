package org.just.leetcode.leetcode594;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int findLHS(int[] nums) {
        int result = 0;
        int maxSubOne;
        int minSubOne;
        int maxSubTwo;
        int minSubTwo;
        int j;
        List<Integer> subListOne;
        List<Integer> subListTwo;
        for (int i = 0; i < nums.length; i++) {
            maxSubOne = nums[i];
            minSubOne = nums[i];
            maxSubTwo = nums[i];
            minSubTwo = nums[i];
            subListOne = new ArrayList<>();
            subListTwo = new ArrayList<>();
            subListOne.add(nums[i]);
            subListTwo.add(nums[i]);
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] >= nums[j] && nums[i] - nums[j] <= 1) {
                    subListOne.add(nums[j]);
                    if (maxSubOne < nums[j]) {
                        maxSubOne = nums[j];
                    }
                    if (minSubOne > nums[j]) {
                        minSubOne = nums[j];
                    }
                }
                if (nums[j] >= nums[i] && nums[j] - nums[i] <= 1) {
                    subListTwo.add(nums[j]);
                    if (maxSubTwo < nums[j]) {
                        maxSubTwo = nums[j];
                    }
                    if (minSubTwo > nums[j]) {
                        minSubTwo = nums[j];
                    }
                }
            }
            if (Math.abs(maxSubOne - minSubOne) == 1) {
                if (subListOne.size() > result) {
                    result = subListOne.size();
                }
            }
            if (Math.abs(maxSubTwo - minSubTwo) == 1) {
                if (subListTwo.size() > result) {
                    result = subListTwo.size();
                }
            }
            if (j == nums.length && maxSubOne == minSubOne && maxSubTwo == minSubTwo) {
                break;
            }
        }
        return result;
    }
}