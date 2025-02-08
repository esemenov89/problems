package org.just.leetcode.leetcode1941;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, Integer> ALPHABET = new HashMap<>();

    static {
        ALPHABET.put('a', 1);
        ALPHABET.put('b', 2);
        ALPHABET.put('c', 3);
        ALPHABET.put('d', 4);
        ALPHABET.put('e', 5);
        ALPHABET.put('f', 6);
        ALPHABET.put('g', 7);
        ALPHABET.put('h', 8);
        ALPHABET.put('i', 9);
        ALPHABET.put('j', 10);
        ALPHABET.put('k', 11);
        ALPHABET.put('l', 12);
        ALPHABET.put('m', 13);
        ALPHABET.put('n', 14);
        ALPHABET.put('o', 15);
        ALPHABET.put('p', 16);
        ALPHABET.put('q', 17);
        ALPHABET.put('r', 18);
        ALPHABET.put('s', 19);
        ALPHABET.put('t', 20);
        ALPHABET.put('u', 21);
        ALPHABET.put('v', 22);
        ALPHABET.put('w', 23);
        ALPHABET.put('x', 24);
        ALPHABET.put('y', 25);
        ALPHABET.put('z', 26);
    }

    public boolean areOccurrencesEqual(String s) {
        boolean result = true;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int occurrences = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (occurrences == 0) {
                occurrences = entry.getValue();
            }
            if (occurrences != entry.getValue()) {
                result = false;
                break;
            }
        }
        return result;
    }
}