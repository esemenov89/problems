package org.just.leetcode.leetcode3498;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, Integer> ALPHABET = new HashMap<>();

    static {
        ALPHABET.put('a', 26);
        ALPHABET.put('b', 25);
        ALPHABET.put('c', 24);
        ALPHABET.put('d', 23);
        ALPHABET.put('e', 22);
        ALPHABET.put('f', 21);
        ALPHABET.put('g', 20);
        ALPHABET.put('h', 19);
        ALPHABET.put('i', 18);
        ALPHABET.put('j', 17);
        ALPHABET.put('k', 16);
        ALPHABET.put('l', 15);
        ALPHABET.put('m', 14);
        ALPHABET.put('n', 13);
        ALPHABET.put('o', 12);
        ALPHABET.put('p', 11);
        ALPHABET.put('q', 10);
        ALPHABET.put('r', 9);
        ALPHABET.put('s', 8);
        ALPHABET.put('t', 7);
        ALPHABET.put('u', 6);
        ALPHABET.put('v', 5);
        ALPHABET.put('w', 4);
        ALPHABET.put('x', 3);
        ALPHABET.put('y', 2);
        ALPHABET.put('z', 1);
    }

    public int reverseDegree(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result += ALPHABET.get(s.charAt(i)) * (i + 1);
        }
        return result;
    }
}