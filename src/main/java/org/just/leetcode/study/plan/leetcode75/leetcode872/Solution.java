package org.just.leetcode.study.plan.leetcode75.leetcode872;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    int maxDepth = 0;

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean result = false;
        TreeNode temp;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root1);
        List<Integer> list1 = new ArrayList<>();
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.left == null && temp.right == null) {
                list1.add(temp.val);
            } else {
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        queue.add(root2);
        List<Integer> list2 = new ArrayList<>();
        while (!queue.isEmpty()) {
            temp = queue.poll();
            if (temp.left == null && temp.right == null) {
                list2.add(temp.val);
            } else {
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        result = list1.equals(list2);
        return result;
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