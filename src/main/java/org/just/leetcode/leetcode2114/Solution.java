package org.just.leetcode.leetcode2114;

public class Solution {

    public int mostWordsFound(String[] sentences) {
        int result = 0;
        String[] words;
        for (String sentence : sentences) {
            words = sentence.split(" ");
            if (words.length > result) {
                result = words.length;
            }
        }
        return result;
    }
}