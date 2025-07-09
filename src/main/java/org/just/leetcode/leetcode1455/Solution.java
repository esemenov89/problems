package org.just.leetcode.leetcode1455;

public class Solution {

    public int isPrefixOfWord(String sentence, String searchWord) {
        int result = -1;
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                result = i + 1;
                break;
            }
        }
        return result;
    }
}