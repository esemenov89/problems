package org.just.leetcode.leetcode2108;


public class Solution {

    public String firstPalindrome(String[] words) {
        String result = "";
        for (String word : words) {
            boolean isPalindrome = true;
            for (int i = 0; i < word.length() / 2; i++) {
                if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            if (isPalindrome) {
                result = word;
                break;
            }
        }
        return result;
    }
}