package org.just.leetcode.leetcode2099;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] maxSubsequence(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        int max;
        int indexMax;
        for (int i = 0; i < k; i++) {
            max = -1000000;
            indexMax = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > max && !map.containsKey(j)) {
                    max = nums[j];
                    indexMax = j;
                }
            }
            map.put(indexMax, max);
        }
        Integer[] temp = map.keySet().toArray(new Integer[0]);
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            result[i] = nums[temp[i]];
        }
        return result;
    }
}