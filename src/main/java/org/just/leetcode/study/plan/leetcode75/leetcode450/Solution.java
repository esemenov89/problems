package org.just.leetcode.study.plan.leetcode75.leetcode450;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private final Queue<TreeNode> queue = new LinkedList<>();
    private TreeNode found = null;

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode result = root;
        return result;
    }

    private void breadth(TreeNode root, int val) {
        if (root == null) {
            return;
        }
        queue.clear();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node != null) {
                if (node.val == val) {
                    found = node;
                    return;
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
    }
}