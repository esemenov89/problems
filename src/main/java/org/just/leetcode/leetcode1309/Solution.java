package org.just.leetcode.leetcode1309;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Integer, Character> ALPHABET = new HashMap<>();

    static {
        ALPHABET.put(1, 'a');
        ALPHABET.put(2, 'b');
        ALPHABET.put(3, 'c');
        ALPHABET.put(4, 'd');
        ALPHABET.put(5, 'e');
        ALPHABET.put(6, 'f');
        ALPHABET.put(7, 'g');
        ALPHABET.put(8, 'h');
        ALPHABET.put(9, 'i');
        ALPHABET.put(10, 'j');
        ALPHABET.put(11, 'k');
        ALPHABET.put(12, 'l');
        ALPHABET.put(13, 'm');
        ALPHABET.put(14, 'n');
        ALPHABET.put(15, 'o');
        ALPHABET.put(16, 'p');
        ALPHABET.put(17, 'q');
        ALPHABET.put(18, 'r');
        ALPHABET.put(19, 's');
        ALPHABET.put(20, 't');
        ALPHABET.put(21, 'u');
        ALPHABET.put(22, 'v');
        ALPHABET.put(23, 'w');
        ALPHABET.put(24, 'x');
        ALPHABET.put(25, 'y');
        ALPHABET.put(26, 'z');
    }

    public String freqAlphabets(String s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '#') {
                continue;
            }
            if (i < chars.length - 2 && chars[i + 2] == '#') {
                stringBuilder.append(ALPHABET.get(Integer.parseInt(s.substring(i, i + 2))));
                i = i + 2;
            } else {
                stringBuilder.append(ALPHABET.get(Integer.parseInt(chars[i] + "")));
            }
        }
        result = stringBuilder.toString();
        return result;
    }
}