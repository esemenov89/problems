package org.just.leetcode.leetcode1816;

public class Solution {

    public String truncateSentence(String s, int k) {
        String result = s;
        int countSpaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                countSpaces++;
            }
            if (countSpaces == k) {
                result = s.substring(0, i);
                break;
            }
        }
        return result;
    }
}