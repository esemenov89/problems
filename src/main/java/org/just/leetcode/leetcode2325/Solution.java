package org.just.leetcode.leetcode2325;

import java.util.HashMap;

public class Solution {

    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> alphabet = new HashMap<>();
        String result = "";
        int alphabetCounter = 97;
        for (int i = 0; i < key.length() && alphabetCounter < 123; i++) {
            if (key.charAt(i) != ' ' && !alphabet.containsKey(key.charAt(i))) {
                alphabet.put(key.charAt(i), (char) alphabetCounter);
                alphabetCounter++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                sb.append(' ');
            } else {
                sb.append(alphabet.get(message.charAt(i)));
            }
        }
        result = sb.toString();
        return result;
    }
}