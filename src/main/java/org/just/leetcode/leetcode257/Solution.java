package org.just.leetcode.leetcode257;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<String> temp = new ArrayList<>();
    private boolean isNotRoot = false;

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result;
        traversePreOrder(root, new StringBuilder("" + root.val));
        result = temp;
        return result;
    }

    private void traversePreOrder(TreeNode node, StringBuilder sb) {
        if (node != null) {
            if (isNotRoot) {
                sb.append("->").append(node.val);
            }
            isNotRoot = true;
            if (node.left == null && node.right == null) {
                temp.add(sb.toString());
            }
            traversePreOrder(node.left, new StringBuilder(sb));
            traversePreOrder(node.right, new StringBuilder(sb));
        }
    }
}