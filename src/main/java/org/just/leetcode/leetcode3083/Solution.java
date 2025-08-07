package org.just.leetcode.leetcode3083;

public class Solution {

    public boolean isSubstringPresent(String s) {
        boolean result = false;
        String reversedS = new StringBuilder(s).reverse().toString();
        for (int i = 0; i < s.length() - 1; i++) {
            if (reversedS.contains(s.substring(i, i + 2))) {
                result = true;
                break;
            }
        }
        return result;
    }
}