package org.just.leetcode.leetcode2094;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] findEvenNumbers(int[] digits) {
        int[] result = new int[digits.length];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                continue;
            }
            for (int j = 0; j < digits.length; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 0; k < digits.length; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    if (digits[k] % 2 == 0) {
                        set.add(Integer.valueOf(digits[i] + "" + digits[j] + digits[k]));
                    }
                }
            }
        }
        result = set.stream().mapToInt(i -> i).toArray();
        Arrays.sort(result);
        return result;
    }
}