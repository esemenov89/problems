package org.just.leetcode.leetcode2200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result;
        Set<Integer> set = new HashSet<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == key) {
                for (int i = 0; i < nums.length; i++) {
                    if (Math.abs(i - j) <= k) {
                        set.add(i);
                    }
                }
            }
        }
        result = new ArrayList<>(set);
        Collections.sort(result);
        return result;
    }
}