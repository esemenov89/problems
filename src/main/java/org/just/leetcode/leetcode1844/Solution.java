package org.just.leetcode.leetcode1844;

public class Solution {

    public String replaceDigits(String s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                stringBuilder.append((char) (s.charAt(i - 1) + Integer.parseInt(s.charAt(i) + "")));
            } else {
                stringBuilder.append(s.charAt(i));
            }
        }
        result = stringBuilder.toString();
        return result;
    }
}