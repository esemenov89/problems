package org.just.leetcode.study.plan.leetcode75.leetcode435;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int pathSum(TreeNode root, int targetSum) {
        int result = 0;
        List<Integer> nodesValue = new ArrayList<>();
        iterate(root,nodesValue);
        return result;
    }

    private void iterate(TreeNode node, List<Integer> nodesValue) {
        if (node != null) {
            nodesValue.add(node.val);
            iterate(node.left, nodesValue);
            iterate(node.right, nodesValue);
        }
    }
}