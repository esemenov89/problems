package org.just.leetcode.leetcode696;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int countBinarySubstrings(String s) {
        int currentIndex = 0;
        int length = s.length();
        List<Integer> groups = new ArrayList<>();
        while (currentIndex < length) {
            int count = 1;
            while (currentIndex + 1 < length && s.charAt(currentIndex + 1) == s.charAt(currentIndex)) {
                currentIndex++;
                count++;
            }
            groups.add(count);
            currentIndex++;
        }
        int totalSubstrings = 0;
        for (int i = 1; i < groups.size(); i++) {
            totalSubstrings += Math.min(groups.get(i - 1), groups.get(i));
        }
        return totalSubstrings;
    }
}