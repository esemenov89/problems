package org.just.leetcode.study.plan.leetcode75.leetcode872;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        boolean result;
        ArrayList<Integer> list1 = new ArrayList<>();
        traversePreOrder(root1, list1);
        ArrayList<Integer> list2 = new ArrayList<>();
        traversePreOrder(root2, list2);
        result = list1.equals(list2);
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