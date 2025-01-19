package studyplan.leetcode75;

import java.util.Date;

public class Leetcode643_leetcode75 {

/*
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.


Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000

Constraints:

n == nums.length
1 <= k <= n <= 10^5
-10^4 <= nums[i] <= 10^4

*/

    public static void main(String[] args) {
        Leetcode643_leetcode75 solution = new Leetcode643_leetcode75();
        long startDate = new Date().getTime();
        System.out.println("nums");
        int[] nums = new int[]{1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(solution.findMaxAverage(nums, k) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 12.75000
        startDate = new Date().getTime();
        System.out.println("nums2");
        int[] nums2 = new int[]{5};
        int k2 = 1;
        System.out.println(solution.findMaxAverage(nums2, k2) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 5
        startDate = new Date().getTime();
        System.out.println("nums2");
        int[] nums3 = new int[100000];
        int k3 = 2;
        for (int i = 0; i < nums3.length; i++) {
            if (i % 2 == 0) {
                nums3[i] = 10000;
            } else {
                nums3[i] = -10000;
            }
        }
        System.out.println(solution.findMaxAverage(nums3, k3) + " seconds:" + (new Date().getTime() - startDate) / 1000);
        System.out.println("-----");
        //Output: 0
    }

    public double findMaxAverage(int[] nums, int k) {
        double result = -100000;
        int sum;
        for (int i = 0; i <= nums.length - k; i++) {
            sum = nums[i];
            for (int j = i + 1; j < i + k; j++) {
                sum += nums[j];
            }
            if ((double) sum / k > result) {
                result = (double) sum / k;
            }
        }
        return result;
    }
}