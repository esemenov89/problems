package org.just.leetcode.leetcode1935;

public class Solution {

    public int canBeTypedWords(String text, String brokenLetters) {
        int result = 0;
        char[] chars = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        boolean contains;
        for (String word : words) {
            contains = false;
            for (char aChar : chars) {
                if (word.contains(String.valueOf(aChar))) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                result++;
            }
        }
        return result;
    }
}