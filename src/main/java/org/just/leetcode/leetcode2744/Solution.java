package org.just.leetcode.leetcode2744;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int maximumNumberOfStringPairs(String[] words) {
        int result = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            if (set.contains(i)) {
                continue;
            }
            for (int j = i + 1; j < words.length; j++) {
                if (set.contains(i)) {
                    continue;
                }
                if (words[i].charAt(0) == words[j].charAt(1)
                        && words[i].charAt(1) == words[j].charAt(0)) {
                    result++;
                    set.add(i);
                    set.add(j);
                    break;
                }
            }
        }
        return result;
    }
}