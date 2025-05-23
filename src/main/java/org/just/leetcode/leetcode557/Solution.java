package org.just.leetcode.leetcode557;

public class Solution {

    public String reverseWords(String s) {
        String result;
        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        char[] temp;
        char tempChar;
        for (int c = 0; c < words.length; c++) {
            temp = words[c].toCharArray();
            for (int i = 0, j = temp.length - 1; i < temp.length / 2 && j >= 0; i++, j--) {
                tempChar = temp[i];
                temp[i] = temp[j];
                temp[j] = tempChar;
            }
            sb.append(temp);
            if (c < words.length - 1) {
                sb.append(" ");
            }
        }
        result = sb.toString();
        return result;
    }
}