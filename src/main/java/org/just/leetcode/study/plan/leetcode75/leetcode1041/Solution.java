package org.just.leetcode.study.plan.leetcode75.leetcode1041;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int COUNT = 0;

    public int goodNodes(TreeNode root) {
        int result;
        iterate(root, new ArrayList<>());
        result = COUNT;
        return result;
    }

    private void iterate(TreeNode node, List<Integer> nodesBefore) {
        if (node != null) {
            boolean isGood = true;
            for (Integer i : nodesBefore) {
                if (i > node.val) {
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                COUNT++;
            }
            nodesBefore.add(node.val);
            iterate(node.left, new ArrayList<>(nodesBefore));
            iterate(node.right, new ArrayList<>(nodesBefore));
        }
    }
}