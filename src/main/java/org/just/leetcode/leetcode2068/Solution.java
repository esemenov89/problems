package org.just.leetcode.leetcode2068;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean checkAlmostEquivalent(String word1, String word2) {
        boolean result = true;
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (Math.abs(entry.getValue() - map2.getOrDefault(entry.getKey(), 0)) > 3) {
                return false;
            }
        }
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            if (Math.abs(entry.getValue() - map1.getOrDefault(entry.getKey(), 0)) > 3) {
                return false;
            }
        }
        return result;
    }
}