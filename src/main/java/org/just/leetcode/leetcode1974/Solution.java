package org.just.leetcode.leetcode1974;

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

    public int minTimeToType(String word) {
        int result = 0;
        int pointer = 1;
        int temp1;
        for (int i = 0; i < word.length(); i++) {
            if (pointer > ALPHABET.get(word.charAt(i))) {
                temp1 = pointer - ALPHABET.get(word.charAt(i));
                if (temp1 > 13) {
                    temp1 = 26 - pointer + ALPHABET.get(word.charAt(i));
                }
            } else {
                temp1 = ALPHABET.get(word.charAt(i)) - pointer;
                if (temp1 > 13) {
                    temp1 = 26 - ALPHABET.get(word.charAt(i)) + pointer;
                }
            }

            result += temp1;
            result += 1;
            pointer = ALPHABET.get(word.charAt(i));
        }
        return result;
    }
}