package org.just.leetcode.leetcode2299;

public class Solution {

    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";

    public boolean strongPasswordCheckerII(String password) {
        boolean result;
        boolean containsLowercaseLetter = false;
        boolean containsUppercaseLetter = false;
        boolean containsDigit = false;
        boolean containsSpecialCharacters = false;
        if (password.length() < 8) {
            return false;
        }
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i != 0 && chars[i] == chars[i - 1]) {
                return false;
            }
            if (!containsDigit && Character.isDigit(chars[i])) {
                containsDigit = true;
            } else if (!containsLowercaseLetter && Character.isLowerCase(chars[i])) {
                containsLowercaseLetter = true;
            } else if (!containsUppercaseLetter && Character.isUpperCase(chars[i])) {
                containsUppercaseLetter = true;
            } else if (!containsSpecialCharacters && SPECIAL_CHARACTERS.indexOf(chars[i]) != -1) {
                containsSpecialCharacters = true;
            }
        }
        result = containsDigit && containsLowercaseLetter && containsUppercaseLetter && containsSpecialCharacters;
        return result;
    }
}