package org.just.leetcode.leetcode2000;

public class Solution {

    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();
        int indexForReverse = word.indexOf(ch);
        if (indexForReverse == 0 || indexForReverse == -1) {
            result = new StringBuilder(word);
        } else {
            char[] wordChars = word.toCharArray();
            for (int i = indexForReverse; i >= 0; i--) {
                result.append(wordChars[i]);
            }
            result.append(word.substring(indexForReverse + 1));
        }
        return result.toString();
    }
}