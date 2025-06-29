package org.just.leetcode.leetcode804;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private final char[] ALPHABET = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < ALPHABET.length; i++) {
            map.put(ALPHABET[i], widths[i]);
        }
        result[0] = 1;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (temp + map.get(s.charAt(i)) <= 100) {
                temp += map.get(s.charAt(i));
            } else {
                temp = 0;
                temp += map.get(s.charAt(i));
                result[0]++;
            }
        }
        result[1] = temp;
        return result;
    }
}