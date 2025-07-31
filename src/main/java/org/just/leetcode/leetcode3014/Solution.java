package org.just.leetcode.leetcode3014;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int minimumPushes(String word) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : word.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Integer> list = map.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .map(Map.Entry::getValue)
                .toList();
        int multiply = 1;
        for (int i = 0; i < list.size(); i++) {
            if (i == 8 || i == 16 || i == 24) {
                multiply++;
            }
            result += list.get(i) * multiply;
        }

        return result;
    }
}