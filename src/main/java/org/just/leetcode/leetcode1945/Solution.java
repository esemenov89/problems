package org.just.leetcode.leetcode1945;

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

    public int getLucky(String s, int k) {
        int result = 0;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            temp.append(ALPHABET.get(s.charAt(i)));
        }
        Integer tempSum = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < temp.length(); j++) {
                tempSum += Integer.parseInt(temp.charAt(j) + "");
            }
            if (i == k - 1) {
                result = tempSum;
            } else {
                temp = new StringBuilder(String.valueOf(tempSum));
                tempSum = 0;
            }
        }
        return result;
    }
}
