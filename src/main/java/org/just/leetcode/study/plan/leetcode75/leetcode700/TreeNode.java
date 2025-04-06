package org.just.leetcode.study.plan.leetcode75.leetcode700;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    private final Queue<TreeNode> queue = new LinkedList<>();

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
        breadth(root, s);
        return s + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }

    // Depth First Search
    private void traversePreOrder(TreeNode node, StringBuilder s) {
        if (node != null) {
            s.append(node.val).append(", ");
            traversePreOrder(node.left, s);
            traversePreOrder(node.right, s);
        } else {
            s.append("null, ");
        }
    }

    // Breadth First Search
    private void breadth(TreeNode root, StringBuilder s) {
        if (root == null) {
            s.append("null");
            return;
        }
        queue.clear();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node != null) {
                s.append(node.val);
                if (node.left != null || node.right != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            } else {
                s.append("null");
            }
            if (!queue.isEmpty()) {
                s.append(", ");
            }
        }
    }
}