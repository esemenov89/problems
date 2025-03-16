package org.just.leetcode.study.plan.leetcode75.leetcode435;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<List<Integer>> lists = new ArrayList<>();

    public int pathSum(TreeNode root, int targetSum) {
        int result = 0;
        List<Integer> nodesValue = new ArrayList<>();
        lists.add(nodesValue);
        iterate(root,nodesValue);
        for (List<Integer> list : lists) {
            int sum;
            for (int i = 0; i < list.size(); i++) {
                sum = list.get(i);
                for (int j = i + 1; j < list.size(); j++) {
                    sum += list.get(j);
                    if (sum == targetSum) {
                        result++;
                        break;
                    }
                }
            }
        }
        return result;
    }

    private void iterate(TreeNode node, List<Integer> nodesValue) {
        if (node != null) {
            nodesValue.add(node.val);
            List<Integer> rightNodesValue = nodesValue;
            if (node.left != null && node.right != null) {
                rightNodesValue = new ArrayList<>(nodesValue);
                lists.add(rightNodesValue);
            }
            iterate(node.left, nodesValue);
            if (node.right != null) {
                iterate(node.right, rightNodesValue);
            }
        }
    }
}