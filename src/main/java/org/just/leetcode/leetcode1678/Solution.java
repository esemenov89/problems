package org.just.leetcode.leetcode1678;

public class Solution {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'G') {
                result.append('G');
            } else if (chars[i] == '(' && i < chars.length - 1) {
                if (chars[i + 1] == ')') {
                    result.append('o');
                } else if (chars[i + 1] == 'a') {
                    result.append("al");
                }
            }
        }
        return result.toString();
    }
}