package org.just.leetcode.study.plan.leetcode75.leetcode1161;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<Integer> levelSums = new ArrayList<>();

    public int maxLevelSum(TreeNode root) {
        int result = 0;
        traversePreOrder(root, 0);
        int max = 0;
        for (int i = 0; i < levelSums.size(); i++) {
            if (i == 0) {
                max = levelSums.get(i);
                result = i + 1;
            }
            if (levelSums.get(i) > max) {
                max = levelSums.get(i);
                result = i + 1;
            }
        }
        return result;
    }

    private void traversePreOrder(TreeNode node, int level) {
        if (node != null) {
            if (levelSums.size() > level) {
                levelSums.set(level, levelSums.get(level) + node.val);
            } else {
                levelSums.add(node.val);
            }
            level++;
            traversePreOrder(node.left, level);
            traversePreOrder(node.right, level);
        }
    }
}