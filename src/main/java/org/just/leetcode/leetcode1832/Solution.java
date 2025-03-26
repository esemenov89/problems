package org.just.leetcode.leetcode1832;


import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final char[] ALPHABET = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public boolean checkIfPangram(String sentence) {
        boolean result = true;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : ALPHABET) {
            map.put(c, 0);
        }
        char[] chars = sentence.toCharArray();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}