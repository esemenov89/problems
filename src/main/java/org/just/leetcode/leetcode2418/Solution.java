package org.just.leetcode.leetcode2418;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        String[] result;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        result = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .map(Map.Entry::getValue)
                .toList()
                .toArray(new String[0]);
        return result;
    }
}