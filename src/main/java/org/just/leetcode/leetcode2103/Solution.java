package org.just.leetcode.leetcode2103;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    Map<Integer, Set<String>> map = new HashMap<>();

    public int countPoints(String rings) {
        int result = 0;
        char[] chars = rings.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 1) {
                if (map.get(Integer.valueOf(chars[i] + "")) == null) {
                    Set<String> set = new HashSet<>();
                    set.add(chars[i - 1] + "");
                    map.put(Integer.valueOf(chars[i] + ""), set);
                } else {
                    Set<String> set = map.get(Integer.valueOf(chars[i] + ""));
                    set.add(chars[i - 1] + "");
                }
            }
        }
        for (Map.Entry<Integer, Set<String>> entry : map.entrySet()) {
            if (entry.getValue().size() == 3) {
                result++;
            }
        }
        return result;
    }
}