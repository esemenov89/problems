package org.just.leetcode.leetcode2283;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {

    public boolean digitCount(String num) {
        boolean result = true;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length(); i++) {
            map.put(num.charAt(i) + "", map.getOrDefault(num.charAt(i) + "", 0) + 1);
        }
        for (int i = 0; i < num.length(); i++) {
            if (!Objects.equals(map.getOrDefault(i + "", 0), Integer.valueOf(num.charAt(i) + ""))) {
                result = false;
                break;
            }
        }
        return result;
    }
}