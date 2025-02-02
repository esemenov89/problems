package leetcode108;

import java.util.Arrays;
import java.util.Date;

public class Leetcode108 {

    /*

Given an integer array nums where the elements are sorted in ascending order, convert it to a
height-balanced
 binary search tree.


Example 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.


Constraints:
1 <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
nums is sorted in a strictly increasing order.
    */

    // TODO: Разобраться в деревьях и вернуться
    public static void main(String[] args) {
        Leetcode108 solution = new Leetcode108();
        long startDate = new Date().getTime();
        int[] nums = new int[]{-10, -3, 0, 5, 9};
        System.out.println(Arrays.toString(nums));
        System.out.println(solution.sortedArrayToBST(nums) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: aaabcbc
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode result = new TreeNode();
        result.val = 0;
        result.left = new TreeNode();
        result.left.val = -3;
        result.left.left = new TreeNode();
        result.left.left.val = -10;
        result.right = new TreeNode();
        result.right.val = 9;
        result.right.left = new TreeNode();
        result.right.left.val = 5;
        iterate(result);
        return result;
    }

    // Рекурсивный обход дерева Прямой
    private void iterate(TreeNode node) {
        if (node != null) {
            System.out.println(node.val);
            iterate(node.left);
            iterate(node.right);
        }
    }
}