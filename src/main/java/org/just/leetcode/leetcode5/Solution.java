package org.just.leetcode.leetcode5;

public class Solution {

    public String longestPalindrome(String s) {
        String result = "";
        int maxPalindromeLength = 0;
        char[] chars = s.toCharArray();
        String temp;
        if (s.length() == 1) {
            return s;
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = chars.length - 1; j > i; j--) {
                if (chars[i] == chars[j]) {
                    temp = s.substring(i, j + 1);
                    if (validPalindrome(temp)) {
                        if (temp.length() > maxPalindromeLength) {
                            maxPalindromeLength = temp.length();
                            result = temp;
                        }
                    }
                }
            }
        }
        if (maxPalindromeLength == 0) {
            result = s.substring(0, 1);
        }
        return result;
    }

    private boolean validPalindrome(String s) {
        boolean result = true;
        if (s.length() == 2 || s.length() == 3) {
            result = true;
        } else {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}