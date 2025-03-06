package org.just.leetcode.leetcode3211;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> validStrings(int n) {
        List<String> result = new ArrayList<>();
        if (n == 1) {
            result.add("0");
            result.add("1");
            return result;
        }
        if (n == 2) {
            result.add("01");
            result.add("11");
            result.add("10");
            return result;
        }
        String baseString = "0".repeat(n);
        char[] baseChars = baseString.toCharArray();
        for (int i = 0; i < baseChars.length; i++) {

        }
        return result;
    }

}