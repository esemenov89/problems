package org.just.leetcode.study.plan.leetcode75.leetcode450;

public class Solution {

    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode result;
        result = breadth(root, key);
        return result;
    }

    private TreeNode breadth(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // Если ключ меньше чем значение, удаляем из левого поддерева
        if (root.val > key) {
            root.left = deleteNode(root.left, key);
            return root;
        }

        // Если ключ больше чем значение, удаляем из левого поддерева
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }

        // Если значение равно ключу

        // Если нет левого поддерева, то возвращаем правое поддерево
        if (root.left == null) {
            return root.right;
        }

        // Если нет правого поддерева, то возвращаем левое поддерево
        if (root.right == null) {
            return root.left;
        }

        // Если есть оба поддерева
        TreeNode successor = root.right;

        // Двигаем указатель пока не достигли налл
        while (successor.left != null) {
            successor = successor.left;
        }

        // Двигаем дерево
        successor.left = root.left;
        root = root.right;

        return root;
    }
}