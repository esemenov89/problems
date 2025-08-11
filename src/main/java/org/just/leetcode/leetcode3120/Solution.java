package org.just.leetcode.leetcode3120;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int numberOfSpecialChars(String word) {
        int result = 0;
        Map<String, Integer> map = new HashMap<>();
        char[] chars = word.toCharArray();
        for (char aChar : chars) {
            map.put(aChar + "", 1);
        }
        for (String key : map.keySet()) {
            if (map.getOrDefault(key.toUpperCase(), 0) == 1 && map.getOrDefault(key.toLowerCase(), 0) == 1) {
                result++;
                map.put(key.toUpperCase(), 0);
                map.put(key.toLowerCase(), 0);
            }
        }
        return result;
    }
}