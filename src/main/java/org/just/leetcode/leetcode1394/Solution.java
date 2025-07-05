package org.just.leetcode.leetcode1394;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public int findLucky(int[] arr) {
        int result = -1;
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : arr) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (Objects.equals(entry.getValue(), entry.getKey())) {
                if (entry.getValue() > result) {
                    result = entry.getKey();
                }
            }
        }
        return result;
    }
}