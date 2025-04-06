package org.just.leetcode.study.plan.leetcode75.leetcode199;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Solution {

    private final List<Integer> rightSideVals = new ArrayList<>();
    private final Queue<TreeNode> queue = new LinkedList<>();
    private boolean onlyOne = false;
    private int level = 0;
    private int right = 0;
    private final List<Map<String, Integer>> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result;
        traversePreOrder(root, 0, "0");
        //breadthTraverse(root);
        result = rightSideVals;
        return result;
    }

    private void breadthTraverse(TreeNode root) {
        if (root == null) {
            return;
        }
        queue.clear();
        queue.add(root);
        rightSideVals.add(root.val);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node != null) {
                if (node.left == null || node.right == null) {
                    onlyOne = true;
                } else {
                    onlyOne = false;
                }
                if (node.right != null) {
                    rightSideVals.add(node.right.val);
                } else if (onlyOne && node.left != null) {
                    rightSideVals.add(node.left.val);
                }
                queue.add(node.left);
                queue.add(node.right);
            }
        }
    }

    private void traversePreOrder(TreeNode node, int level, String position) {
        if (node != null) {
            System.out.println("level: " + level + " val: " + node.val + " position: " + position);
            Map<String, Integer> map;
            if (list.size() > level) {
                map = list.get(level);
            } else {
                map = new HashMap<>();
                list.add(level, map);
            }
            map.put(position, node.val);
            level++;
            traversePreOrder(node.left, level, position + 0);
            traversePreOrder(node.right, level, position + 1);
        }
    }

    private void fillRightSideVals() {
        for (int i = 0; i < list.size(); i++) {
            int maxRights = 0;
            Map<String, Integer> map = list.get(i);
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                int foo = Integer.parseInt("1001", 2);
                if (Integer.parseInt(entry.getKey()) > maxRights) {}
            }
        }
    }
}