package org.just.leetcode.leetcode1399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int countLargestGroup(int n) {
        int result = 0;
        int maxGroup = 0;
        int sum = 0;
        String iStr;
        Map<Integer, List<Integer>> groups = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            sum = 0;
            if (i >= 10) {
                iStr = Integer.toString(i);
                for (int j = 0; j < iStr.length(); j++) {
                    sum += Integer.parseInt(iStr.substring(j, j + 1));
                }
            } else {
                sum = i;
            }
            List<Integer> group = groups.get(sum);
            if (group == null) {
                group = new ArrayList<>();
                group.add(i);
                groups.put(sum, group);
            } else {
                group.add(i);
            }
            if (group.size() > maxGroup) {
                maxGroup = group.size();
            }
        }
        for (List<Integer> group : groups.values()) {
            if (group.size() == maxGroup) {
                result++;
            }
        }
        return result;
    }
}