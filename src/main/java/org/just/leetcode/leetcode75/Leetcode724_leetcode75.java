package org.just.leetcode.leetcode75;

import java.util.Date;

public class Leetcode724_leetcode75 {

/*

Given an array of integers nums, calculate the pivot index of this array.
The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
Return the leftmost pivot index. If no such index exists, return -1.


Example 1:
Input: nums = [1,7,3,6,5,6]
Output: 3
Explanation:
The pivot index is 3.
Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
Right sum = nums[4] + nums[5] = 5 + 6 = 11

Example 2:
Input: nums = [1,2,3]
Output: -1
Explanation:
There is no index that satisfies the conditions in the problem statement.

Example 3:
Input: nums = [2,1,-1]
Output: 0
Explanation:
The pivot index is 0.
Left sum = 0 (no elements to the left of index 0)
Right sum = nums[1] + nums[2] = 1 + -1 = 0


Constraints:
1 <= nums.length <= 10^4
-1000 <= nums[i] <= 1000

*/

    public static void main(String[] args) {
        Leetcode724_leetcode75 solution = new Leetcode724_leetcode75();
        long startDate = new Date().getTime();
        int[] nums = new int[]{1, 7, 3, 6, 5, 6};
        solution.printNums(nums);
/*        System.out.println(solution.pivotIndex(nums) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 3
        startDate = new Date().getTime();
        int[] nums2 = new int[]{1, 2, 3};
        solution.printNums(nums2);
        System.out.println(solution.pivotIndex(nums2) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: -1
        startDate = new Date().getTime();
        int[] nums3 = new int[]{2, 1, -1};
        solution.printNums(nums3);
        System.out.println(solution.pivotIndex(nums3) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 0
        int[] nums4 = new int[10000 - 1];
        Arrays.fill(nums4, 100);
        solution.printNums(nums4);
        System.out.println(solution.pivotIndex(nums4) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");*/
        //Output: 4999
        int[] nums5 = new int[100];
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                nums5[i] = 100;
            } else {
                nums5[i] = -100;
            }
        }
        solution.printNums(nums5);
        System.out.println(solution.pivotIndex(nums5) + " milliseconds:" + (new Date().getTime() - startDate));
        System.out.println("-----");
        //Output: 4999
    }

    public int pivotIndex(int[] nums) {
        int result = -1;
        int leftSum = 0;
        int rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != 0) {
                leftSum += nums[i - 1];
            }
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                result = i;
                break;
            }
        }
        return result;
    }

    private void printNums(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.print(nums[i]);
            } else {
                System.out.print(nums[i] + ", ");
            }
        }
        System.out.println();
    }
}