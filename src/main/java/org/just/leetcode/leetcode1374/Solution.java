package org.just.leetcode.leetcode1374;

public class Solution {

    public String generateTheString(int n) {
        String result = "";
        if (n % 2 == 0) {
            result = "x".repeat(n - 1) + "y";
        } else {
            if (n == 1) {
                result = "x";
            } else {
                result = "x".repeat(n - 2) + "y" + "z";
            }
        }
        return result;
    }
}