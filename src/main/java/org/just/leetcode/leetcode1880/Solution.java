package org.just.leetcode.leetcode1880;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<Character, String> ALPHABET = new HashMap<>();

    static {
        ALPHABET.put('a', "0");
        ALPHABET.put('b', "1");
        ALPHABET.put('c', "2");
        ALPHABET.put('d', "3");
        ALPHABET.put('e', "4");
        ALPHABET.put('f', "5");
        ALPHABET.put('g', "6");
        ALPHABET.put('h', "7");
        ALPHABET.put('i', "8");
        ALPHABET.put('j', "9");
    }

    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        boolean result;
        int firstWordNum;
        int secondWordNum;
        int targetWordNum;
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            temp.append(ALPHABET.get(firstWord.charAt(i)));
        }
        firstWordNum = Integer.parseInt(temp.toString());
        temp.setLength(0);
        for (int i = 0; i < secondWord.length(); i++) {
            temp.append(ALPHABET.get(secondWord.charAt(i)));
        }
        secondWordNum = Integer.parseInt(temp.toString());
        temp.setLength(0);
        for (int i = 0; i < targetWord.length(); i++) {
            temp.append(ALPHABET.get(targetWord.charAt(i)));
        }
        targetWordNum = Integer.parseInt(temp.toString());
        result = firstWordNum + secondWordNum == targetWordNum;
        return result;
    }
}