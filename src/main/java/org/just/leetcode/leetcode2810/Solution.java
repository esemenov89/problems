package org.just.leetcode.leetcode2810;

public class Solution {

    public String finalString(String s) {
        String result;
        String temp = "";
        char tempChar;
        char[] tempChars;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                tempChars = temp.toCharArray();
                for (int j = 0, k = temp.length() - 1; j < temp.length() / 2 && k >= 0; j++, k--) {
                    tempChar = tempChars[k];
                    tempChars[k] = tempChars[j];
                    tempChars[j] = tempChar;
                }
                temp = new String(tempChars);
            } else {
                temp += s.substring(i, i + 1);
            }
        }
        result = temp;
        return result;
    }
}