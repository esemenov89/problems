package org.just.leetcode.study.plan.leetcode75.leetcode236;


public class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = null;
        return result;
    }

    private void traversePreOrder(TreeNode node) {
        if (node != null) {
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
}