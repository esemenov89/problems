package org.just.leetcode.leetcode2828;


import java.util.List;

public class Solution {

    public boolean isAcronym(List<String> words, String s) {
        boolean result = true;
        if (words.size() != s.length()) {
            return false;
        }
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).charAt(0) != s.charAt(i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}