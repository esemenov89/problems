package org.just.leetcode.leetcode383;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        boolean result = true;
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Character c : ransomNote.toCharArray()) {
            if (map.getOrDefault(c, 0) == 0) {
                result = false;
                break;
            } else {
                map.put(c, map.getOrDefault(c, 0) - 1);
            }
        }
        return result;
    }
}