package org.just.leetcode.leetcode1662;

public class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean result;
        StringBuilder word1Builder = new StringBuilder();
        StringBuilder word2Builder = new StringBuilder();
        for (String word : word1) {
            word1Builder.append(word);
        }
        for (String word : word2) {
            word2Builder.append(word);
        }
        result = word1Builder.toString().contentEquals(word2Builder);
        return result;
    }
}