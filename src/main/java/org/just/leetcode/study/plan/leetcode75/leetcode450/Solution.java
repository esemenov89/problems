package org.just.leetcode.study.plan.leetcode75.leetcode450;


import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    private final Queue<TreeNode> queue = new LinkedList<>();
    private TreeNode found = null;

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode result = root;
        result = breadth(root, key);
        return result;
    }

    private TreeNode breadth(TreeNode root, int key) {
        // Base case: if the root is null, return null
        if (root == null) {
            return null;
        }

        // If the key is smaller than root's value, delete in the left subtree
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }

        // If the key is greater than root's value, delete in the right subtree
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }

        // If the root itself is the node to be deleted

        // If the root has no left child, return the right child directly
        if (root.left == null) {
            return root.right;
        }

        // If the root has no right child, return the left child directly
        if (root.right == null) {
            return root.left;
        }

        // If the root has both left and right children
        TreeNode successor = root.right;

        // Find the successor (smallest in the right subtree)
        while (successor.left != null) {
            successor = successor.left;
        }

        // Move the left subtree of the root to the left of the successor
        successor.left = root.left;

        // The new root should be the right child of the deleted node
        root = root.right;

        // Return the modified tree
        return root;
    }
}