package org.just.leetcode.leetcode1859;


public class Solution {

    public String sortSentence(String s) {
        String result;
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        String[] sorted = new String[words.length];
        for (String word : words) {
            sorted[Integer.parseInt(word.substring(word.length() - 1)) - 1] = word.substring(0, word.length() - 1);
        }
        for (int i = 0; i < sorted.length; i++) {
            if (i == sorted.length - 1) {
                sb.append(sorted[i]);
            } else {
                sb.append(sorted[i]).append(" ");
            }
        }
        result = sb.toString();
        return result;
    }
}