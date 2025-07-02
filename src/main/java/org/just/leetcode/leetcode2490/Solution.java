package org.just.leetcode.leetcode2490;

public class Solution {

    public boolean isCircularSentence(String sentence) {
        boolean result = true;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1) {
               if (!words[0].substring(0, 1).equals(words[i].substring(words[i].length() - 1))) {
                   result = false;
               }
            } else {
                if (i + 1 < words.length && !words[i].substring(words[i].length() - 1).equals(words[i + 1].substring(0, 1))) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}