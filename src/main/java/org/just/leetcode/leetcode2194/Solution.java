package org.just.leetcode.leetcode2194;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final char[] ALPHABET = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        boolean found = false;
        for (char c : ALPHABET) {
            if (s.charAt(0) == c || found) {
                found = true;
                result.add(c + s.substring(1, 2));
                int start = Integer.parseInt(s.substring(1, 2));
                int end = Integer.parseInt(s.substring(4, 5));
                start++;
                while (start <= end) {
                    result.add(c + String.valueOf(start));
                    start++;
                }
                if (c == s.charAt(3)) {
                    break;
                }
            }
        }
        return result;
    }
}