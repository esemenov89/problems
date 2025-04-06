package org.just.leetcode.study.plan.leetcode75.leetcode199;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    List<TreeNode> treeNodeOne = new ArrayList<>();
    List<TreeNode> treeNodeTwo = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    boolean foundOne = false;
    boolean foundTwo = false;

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        return result;
    }

    private void traversePreOrder(TreeNode node, int val1, int val2, TreeNode ancestor, List<TreeNode> ancestors) {
        if (node != null) {
            if (ancestor != null) {
                if (ancestors.isEmpty() || ancestors.get(ancestors.size() - 1) != ancestor) {
                    ancestors.add(ancestor);
                }
            }
            if (node.val == val1) {
                ancestors.add(node);
                treeNodeOne = new ArrayList<>(ancestors);
                foundOne = true;
            }
            if (node.val == val2) {
                ancestors.add(node);
                treeNodeTwo = new ArrayList<>(ancestors);
                foundTwo = true;
            }
            if (!(foundOne && foundTwo)) {
                traversePreOrder(node.left, val1, val2, node, ancestors);
                traversePreOrder(node.right, val1, val2, node, ancestors);
            }
        }
    }

    private List<TreeNode> getAncestors(List<TreeNode> list) {
        List<TreeNode> result = new ArrayList<>();
        TreeNode child = list.get(list.size() - 1);
        result.add(child);
        for (int i = list.size() - 2; i >= 0; i--) {
            if (list.get(i).left == child || list.get(i).right == child) {
                child = list.get(i);
                result.add(child);
            }
        }
        return result;
    }
}