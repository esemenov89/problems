package org.just.leetcode.leetcode2309;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, Character> ALPHABET = new HashMap<>();

    static {
        ALPHABET.put('a', 'A');
        ALPHABET.put('b', 'B');
        ALPHABET.put('c', 'C');
        ALPHABET.put('d', 'D');
        ALPHABET.put('e', 'E');
        ALPHABET.put('f', 'F');
        ALPHABET.put('g', 'G');
        ALPHABET.put('h', 'H');
        ALPHABET.put('i', 'I');
        ALPHABET.put('j', 'J');
        ALPHABET.put('k', 'K');
        ALPHABET.put('l', 'L');
        ALPHABET.put('m', 'M');
        ALPHABET.put('n', 'N');
        ALPHABET.put('o', 'O');
        ALPHABET.put('p', 'P');
        ALPHABET.put('q', 'Q');
        ALPHABET.put('r', 'R');
        ALPHABET.put('s', 'S');
        ALPHABET.put('t', 'T');
        ALPHABET.put('u', 'U');
        ALPHABET.put('v', 'V');
        ALPHABET.put('w', 'W');
        ALPHABET.put('x', 'X');
        ALPHABET.put('y', 'Y');
        ALPHABET.put('z', 'Z');
    }

    public String greatestLetter(String s) {
        String result = "";
        char temp = '0';
        char tempLowerCase = '0';
        for (int i = 0; i < s.length(); i++) {
            if (ALPHABET.containsKey(s.charAt(i)) && s.contains(ALPHABET.get(s.charAt(i)) + "") && s.charAt(i) > tempLowerCase) {
                temp = ALPHABET.get(s.charAt(i));
                tempLowerCase = s.charAt(i);
            }
        }
        if (temp != '0') {
            result = temp + "";
        }
        return result;
    }
}