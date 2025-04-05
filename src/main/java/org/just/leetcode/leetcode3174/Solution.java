package org.just.leetcode.leetcode3174;


import java.util.Set;

public class Solution {

    private static final Set<Character> DIGITS = Set.of('1', '2', '3', '4', '5', '6', '7', '8', '9', '0');

    public String clearDigits(String s) {
        String result = "";
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (DIGITS.contains(stringBuilder.charAt(i)) && i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (!DIGITS.contains(stringBuilder.charAt(j))) {
                        stringBuilder.deleteCharAt(i);
                        stringBuilder.deleteCharAt(j);
                        i = i - 2;
                        break;
                    }
                }
            }
        }
        result = stringBuilder.toString();
        return result;
    }
}