package org.just.leetcode.leetcode594;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int findLHS(int[] nums) {
        int result = 0;
        int maxSub;
        int minSub;
        int j;
        List<Integer> subList;
        for (int i = 0; i < nums.length; i++) {
            maxSub = nums[i];
            minSub = nums[i];
            subList = new ArrayList<>();
            subList.add(nums[i]);
            for (j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= 1) {
                    subList.add(nums[j]);
                    if (maxSub < nums[j]) {
                        maxSub = nums[j];
                    }
                    if (minSub > nums[j]) {
                        minSub = nums[j];
                    }
                }
            }
            if (Math.abs(maxSub - minSub) == 1) {
                if (subList.size() > result) {
                    result = subList.size();
                }
            }
            if (j == nums.length && maxSub == minSub) {
                break;
            }
        }
        return result;
    }
}