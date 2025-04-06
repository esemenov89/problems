package org.just.leetcode.study.plan.leetcode75.leetcode700;


public class Solution {

    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode result = root;
        return result;
    }

    private void traversePreOrder(TreeNode node, int level) {
        if (node != null) {
            traversePreOrder(node.left, level);
            traversePreOrder(node.right, level);
        }
    }
}