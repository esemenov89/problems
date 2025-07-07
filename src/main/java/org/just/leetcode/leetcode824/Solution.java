package org.just.leetcode.leetcode824;

import java.util.Set;

public class Solution {

    private static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

    public String toGoatLatin(String sentence) {
        String result;
        String[] words = sentence.split(" ");
        StringBuilder resultSb = new StringBuilder();
        StringBuilder tempSb;
        for (int i = 0; i < words.length; i++) {
            tempSb = new StringBuilder(words[i]);
            if (!VOWELS.contains(words[i].charAt(0))) {
                tempSb.append(tempSb.charAt(0));
                tempSb.deleteCharAt(0);
            }
            tempSb.append("ma").append("a".repeat(i + 1));
            if (i < words.length - 1) {
                tempSb.append(" ");
            }
            resultSb.append(tempSb);
        }
        result = resultSb.toString();
        return result;
    }
}