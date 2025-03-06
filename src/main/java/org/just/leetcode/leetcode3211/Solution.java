package org.just.leetcode.leetcode3211;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        int max = Integer.parseInt("1".repeat(n), 2);
        String string;
        Set<String> strings = new HashSet<>();
        for (int i = 0; i <= max; i++) {
            string = Integer.toBinaryString(i);
            if (string.length() < n) {
                string = "0".repeat(n - string.length()) + string;
            }
            if (validStrings(string)) {
                strings.add(string);
            }
        }
        result.addAll(strings);
        return result;
    }

    private boolean validStrings(String s) {
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && s.charAt(i) == '0' && s.charAt(i - 1) == '0') {
                result = false;
                break;
            }
        }
        return result;
    }
}