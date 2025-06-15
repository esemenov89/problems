package org.just.leetcode.leetcode3289;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int n = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                result[n++] = i;
            }
        }
        return result;
    }
}