package org.just.leetcode.study.plan.leetcode75.leetcode104;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        TreeNode root = this;
        StringBuilder s = new StringBuilder("[");
        traversePreOrder(root, s);
        return s.toString() + "]";
    }

    private void traversePreOrder(TreeNode node, StringBuilder s) {
        if (node != null) {
            s.append(node.val).append(", ");
            traversePreOrder(node.left, s);
            traversePreOrder(node.right, s);
        } else {
            s.append("null, ");
        }
    }
}