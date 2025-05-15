package org.just.leetcode.leetcode2900;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> result = new ArrayList<>();
        int before = -1;
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != before) {
                result.add(words[i]);
                before = groups[i];
            }
        }
        return result;
    }
}