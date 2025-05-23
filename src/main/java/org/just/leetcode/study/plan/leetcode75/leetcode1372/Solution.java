package org.just.leetcode.study.plan.leetcode75.leetcode1372;

public class Solution {

    int maxZigZag = 0;
    boolean isRoot = true;

    public int longestZigZag(TreeNode root) {
        int result;
        traversePreOrder(root, 0, 0);
        result = maxZigZag;
        return result;
    }

    private void traversePreOrder(TreeNode node, int count, int direction) {
        if (node != null) {
            if (!isRoot) {
                count++;
            }
            if (isRoot) {
                isRoot = false;
            }
            if (node.left != null) {
                if (direction == 1) {
                    maxZigZag = Math.max(maxZigZag, count);
                    traversePreOrder(node.left, 0, 1);
                } else if (direction == 2 || direction == 0) {
                    traversePreOrder(node.left, count, 1);
                }
            }
            if (node.right != null) {
                if (direction == 2) {
                    maxZigZag = Math.max(maxZigZag, count);
                    traversePreOrder(node.right, 0, 2);
                } else if (direction == 1 || direction == 0) {
                    traversePreOrder(node.right, count, 2);
                }
            }
            if (node.left == null && node.right == null) {
                maxZigZag = Math.max(maxZigZag, count);
            }
        }
    }
}