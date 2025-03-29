package org.just.leetcode.study.plan.leetcode75.leetcode1372;

import java.util.List;

public class Solution {

    public int longestZigZag(TreeNode root) {
        int result = 0;
        return result;
    }

    private void traversePreOrder(TreeNode node, List<Integer> list) {
        if (node != null) {
            if (node.left != null || node.right != null) {
                traversePreOrder(node.left, list);
                traversePreOrder(node.right, list);
            } else {
                list.add(node.val);
            }
        }
    }
}