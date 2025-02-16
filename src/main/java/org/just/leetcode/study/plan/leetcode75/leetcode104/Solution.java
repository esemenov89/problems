package org.just.leetcode.study.plan.leetcode75.leetcode104;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int maxDepth(TreeNode root) {
        int result = 0;
        int left = 0;
        int right = 0;
        TreeNode temp; //a binary tree with a inner generic node class
        Queue<TreeNode> queue = new LinkedList<>(); //can't instantiate a Queue since abstract, so use LLQueue
        if (root == null) {
            return 0;
        }
        queue.add(root);
        left++;
        right++;
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.left != null) {
                left++;
                queue.add(temp.left);
            }
            if (temp.right != null) {
                right++;
                queue.add(temp.right);
            }
        }
        result = Math.max(result, left) + right;
        return result;
    }
}