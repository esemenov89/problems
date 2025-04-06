package org.just.leetcode.leetcode1614;


public class Solution {

    public int maxDepth(String s) {
        int result = 0;
        int sumParentheses = 0;
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(') {
                sumParentheses++;
            }
            if (aChar == ')') {
                sumParentheses--;
            }
            if (sumParentheses > result) {
                result = sumParentheses;
            }
        }
        return result;
    }
}