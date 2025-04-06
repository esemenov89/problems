package org.just.leetcode.study.plan.leetcode75.leetcode1161;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Solution {

    private final List<Integer> rightSideVals = new ArrayList<>();
    private final List<Map<String, Integer>> list = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        int result = 0;
        return result;
    }

    private void traversePreOrder(TreeNode node, int level, String position) {
        if (node != null) {
            Map<String, Integer> map;
            if (list.size() > level) {
                map = list.get(level);
            } else {
                map = new HashMap<>();
                list.add(level, map);
            }
            map.put(position, node.val);
            level++;
            traversePreOrder(node.left, level, position + 0);
            traversePreOrder(node.right, level, position + 1);
        }
    }

    private void fillRightSideVals() {
        for (Map<String, Integer> stringIntegerMap : list) {
            String key = "";
            if (stringIntegerMap.size() == 1) {
                rightSideVals.add(stringIntegerMap.values().iterator().next());
                continue;
            }
            Set<String> goods = new HashSet<>();
            for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
                goods.add(entry.getKey());
            }
            String firstKey = stringIntegerMap.entrySet().iterator().next().getKey();
            char[] charsKey = firstKey.toCharArray();
            for (int i = 0; i < charsKey.length; i++) {
                Set<String> zeros = new HashSet<>();
                Set<String> ones = new HashSet<>();
                for (String s : goods) {
                    if (s.charAt(i) == '0') {
                        zeros.add(s);
                    } else if (s.charAt(i) == '1') {
                        ones.add(s);
                    }
                }
                if (ones.size() == 1) {
                    key = ones.iterator().next();
                    break;
                }
                if (ones.size() > 1) {
                    for (String s : zeros) {
                        goods.remove(s);
                    }
                }
            }
            rightSideVals.add(stringIntegerMap.get(key));
        }
    }
}