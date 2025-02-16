package org.just.leetcode.study.plan.leetcode75.leetcode104;

public class Solution {

    int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        traversePreOrder(root, 0);
        return maxDepth;
    }

    private void traversePreOrder(TreeNode node, int sum) {
        if (node != null) {
            sum++;
            if (sum > maxDepth) {
                maxDepth = sum;
            }
            traversePreOrder(node.left, sum);
            traversePreOrder(node.right, sum);
        }
    }
}