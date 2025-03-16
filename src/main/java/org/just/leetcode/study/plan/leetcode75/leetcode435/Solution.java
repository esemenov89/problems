package org.just.leetcode.study.plan.leetcode75.leetcode435;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int globalResult = 0;
    private int globalTargetSum = 0;

    public int pathSum(TreeNode root, int targetSum) {
        int result;
        globalTargetSum = targetSum;
        List<Integer> nodesValue = new ArrayList<>();
        iterate(root, nodesValue);
        result = globalResult;
        return result;
    }

    private void iterate(TreeNode node, List<Integer> nodesValue) {
        if (node != null) {
            nodesValue.add(node.val);
            pathSum(nodesValue);
            List<Integer> rightNodesValue = nodesValue;
            if (node.left != null && node.right != null) {
                rightNodesValue = new ArrayList<>(nodesValue);
            }
            iterate(node.left, nodesValue);
            if (node.right != null) {
                iterate(node.right, rightNodesValue);
            }
        }
    }

    private void pathSum(List<Integer> nodesValue) {
        int sum = nodesValue.get(nodesValue.size() - 1);
        if (sum == globalTargetSum) {
            globalResult++;
        }
        for (int i = nodesValue.size() - 2; i >= 0; i--) {
            sum += nodesValue.get(i);
            if (sum == globalTargetSum) {
                globalResult++;
            }
        }
    }
}