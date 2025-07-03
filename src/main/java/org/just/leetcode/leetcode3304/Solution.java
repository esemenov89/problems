package org.just.leetcode.leetcode3304;

public class Solution {

    public char kthCharacter(int k) {
        char result;
        StringBuilder a = new StringBuilder("a");
        int length;
        char newChar;
        while (k > a.length()) {
            length = a.length();
            for (int i = 0; i < length; i++) {
                newChar = a.charAt(i);
                if (newChar == 'z') {
                    newChar = 'a';
                } else {
                    newChar++;
                }
                a.append(newChar);
            }
        }
        result = a.charAt(k - 1);
        return result;
    }
}